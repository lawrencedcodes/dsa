package com.topsoutherncoders.countrydata;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nasa")
public class NasaController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/apod")
    public String getApod() {
        return restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY", String.class);
    }

    @Get

    @GetMapping("/apod/list")
    public List<String> getApodList() {
        return Arrays.asList(
                restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY", String.class));
    }

    @GetMapping("/spaceimage")
    public Object getImage() {
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY";
        Object spaceImages = restTemplate.getForObject(url, Object.class);
        return spaceImages;
    }

}
