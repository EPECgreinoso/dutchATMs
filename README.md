# SPRING BOOT CHALLENGE (JAVA-01)
## _Dutch ATMs_

This application allows you to search the Dutch ATM network by any field.
## Technologies
For Backend:
- Java + SpringBoot
- MapStruct
- OpenApi
- Springboot Feign Clients

For FrontEnd:
- Vue3 + Quasar

## Features

- Search and ATM for any field
- Open GoogleMaps for each location

## URLs
- Swagger : http://localhost:8080/swagger-ui/index.html

## Explanation

> The controller has only one method which is in charge of receiving by parameter the term by which the ATM search is to be performed.
It has an interface called IAtmService and the method getAtmByTerm. The implementation of this one is in charge of making the search, consuming through a feign client (AtmFeignClient) that has the JSON mocked with all the ATM. The feign client returns a list of ATMs and these are then mapped through mapstruct to their version in DTO.


## Installation

You should clone the frontend and backend repository
- Backend https://github.com/EPECgreinoso/dutchATMs
- Frontend https://github.com/EPECgreinoso/fe-dutchATMs

Once the repositories are cloned you should execute on the source path the following commands for each project
For backend
```sh
docker build -t backend .
docker run -d -p 8080:8080 --name be backend
```
For Frontend
```sh
docker build -t frontend .
docker run -d -p 80:80 --name fe frontend
```
To check that everything is running OK
you should access
http://localhost:80



**Gerardo Reinoso**

