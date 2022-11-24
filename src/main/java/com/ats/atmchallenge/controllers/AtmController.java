package com.ats.atmchallenge.controllers;

import com.ats.atmchallenge.dtos.AtmDto;
import com.ats.atmchallenge.services.IAtmService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/atm")
public class AtmController {
    @Autowired
    private IAtmService service;

    @GetMapping("/")
    public List<AtmDto> getFiltered(@RequestParam String term) {
        List<AtmDto> test = service.getAtmByTerm(term);
        log.info(test.toString());
        return test;
    }


}
