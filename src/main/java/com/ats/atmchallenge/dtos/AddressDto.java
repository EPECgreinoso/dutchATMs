package com.ats.atmchallenge.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;
    private GeoLocationDto geoLocation;

}
