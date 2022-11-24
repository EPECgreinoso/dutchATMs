package com.ats.atmchallenge.services;

import com.ats.atmchallenge.dtos.AtmDto;
import java.util.List;

public interface IAtmService {
    List<AtmDto> getAtmByTerm(String term);
}
