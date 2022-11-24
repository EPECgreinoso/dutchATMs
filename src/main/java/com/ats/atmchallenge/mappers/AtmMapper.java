package com.ats.atmchallenge.mappers;

import com.ats.atmchallenge.dtos.AddressDto;
import com.ats.atmchallenge.dtos.AtmDto;
import com.ats.atmchallenge.dtos.GeoLocationDto;
import com.ats.atmchallenge.models.Address;
import com.ats.atmchallenge.models.Atm;
import com.ats.atmchallenge.models.GeoLocation;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
    componentModel = "spring"
)
public interface AtmMapper {

    AtmMapper INSTANCE = Mappers.getMapper(AtmMapper.class);

    List<AtmDto> convertAtmListToAtmDtoList(List<Atm> list);

    AtmDto atmToDto(Atm atm);
    @Mapping(target = "houseNumber", source = "housenumber")
    @Mapping(target = "postalCode", source = "postalcode")
    AddressDto addressToDto(Address address);

    GeoLocationDto geoLocationToDto(GeoLocation geoLocation);

}
