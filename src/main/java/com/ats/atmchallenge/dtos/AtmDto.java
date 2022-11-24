package com.ats.atmchallenge.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtmDto {
    private AddressDto address;
    private Integer distance;
    private String type;

}
