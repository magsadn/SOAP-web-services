package com.magsad.consumingwebservice;

import com.magsad.consumingwebservice.wsdl.GetCountryResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/country")
public class RestController {
    CountryClient countryClient = new CountryClient();
    public RestController(CountryClient countryClient) {
        this.countryClient = countryClient;
    }
    @GetMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetCountryResponse getCountryResponse(@PathVariable String name){
        return countryClient.getCountry(name);
    }
}
