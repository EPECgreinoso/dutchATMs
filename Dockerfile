# Container in which to build the application
FROM gradle:jdk11 as builder

# Copy the source code into the builder container
WORKDIR /app/
COPY . .

# Application version environmental variable
ENV APP_VERSION=${VERSION}

# Build the application in the builder container
RUN gradle clean

# Build the application in the builder container
RUN gradle assemble

# Container in which to run the application
FROM adoptopenjdk/openjdk11:jdk-11.0.6_10-alpine-slim

# Copy the jar from the builder container into the run container
COPY --from=builder /app/build/libs/atm-challenge-*-all.jar app.jar

COPY ./plugins* /plugins/

# Application version environmental variable
ARG APP_VERSION
ENV APP_VERSION=$APP_VERSION

# Run the application
EXPOSE 8080
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar app.jar
