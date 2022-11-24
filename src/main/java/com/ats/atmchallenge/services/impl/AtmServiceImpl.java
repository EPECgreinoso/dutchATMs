package com.ats.atmchallenge.services.impl;

import com.ats.atmchallenge.clients.AtmFeignClient;
import com.ats.atmchallenge.dtos.AtmDto;
import com.ats.atmchallenge.mappers.AtmMapper;
import com.ats.atmchallenge.services.IAtmService;
import com.ats.atmchallenge.utils.FinderHelper;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AtmServiceImpl implements IAtmService {

    @Autowired
    private AtmFeignClient client;

    public List<AtmDto> getAtmByTerm(String term) {
        log.info("AtmServiceImpl - getAtmByTerm called for term: %s ", term);
        return AtmMapper.INSTANCE.convertAtmListToAtmDtoList(
            client.getAll().stream().filter(atm -> FinderHelper.fullSearch(atm, term))
                .collect(Collectors.toList()));
    }


}
