package com.ats.atmchallenge.clients;

import com.ats.atmchallenge.models.Atm;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "atmService", url = "https://mocki.io/v1", configuration = FeignConfig.class)
public interface AtmFeignClient {
    @GetMapping(value = "/d46e0beb-94f7-419d-8e91-180bcc8abda8")
    List<Atm> getAll();
}
