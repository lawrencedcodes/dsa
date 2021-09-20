package com.topsoutherncoders.countrydata;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NasaController {

    @Autowired
    private RestTemplate restTemplate;

    private static String url = "https://api.nasa.gov/planetary/apod?api_key=OlFzSnl7p4jdnBzyxu534SH5wvOENgE0uY3pgItR";

    @GetMapping("/spaceimage")
    public List<Object> getCountries() {
        Object[] countries = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(countries);
    }

}
