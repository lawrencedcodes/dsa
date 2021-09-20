package com.topsoutherncoders.countrydata;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

    @Autowired
    private RestTemplate restTemplate;

    private static String url = "https://restcountries.eu/rest/v2/all";

    @GetMapping("/countries")
    public List<Object> getCountries() {
        Object[] countries = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/name")
    public List<Object> getCountriesByName(String name) {
        Object[] countries = restTemplate.getForObject(url + "?name=" + name, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/capital")
    public List<Object> getCountriesByCapital(String capital) {
        Object[] countries = restTemplate.getForObject(url + "?capital=" + capital, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/region")
    public List<Object> getCountriesByRegion(String region) {
        Object[] countries = restTemplate.getForObject(url + "?region=" + region, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/subregion")
    public List<Object> getCountriesBySubregion(String subregion) {
        Object[] countries = restTemplate.getForObject(url + "?subregion=" + subregion, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/population")
    public List<Object> getCountriesByPopulation(int population) {
        Object[] countries = restTemplate.getForObject(url + "?population=" + population, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/area")
    public List<Object> getCountriesByArea(int area) {
        Object[] countries = restTemplate.getForObject(url + "?area=" + area, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/currencies")
    public List<Object> getCountriesByCurrencies(String currencies) {
        Object[] countries = restTemplate.getForObject(url + "?currencies=" + currencies, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/languages")
    public List<Object> getCountriesByLanguages(String languages) {
        Object[] countries = restTemplate.getForObject(url + "?languages=" + languages, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/borders")
    public List<Object> getCountriesByBorders(String borders) {
        Object[] countries = restTemplate.getForObject(url + "?borders=" + borders, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/callingcode")
    public List<Object> getCountriesByCallingCode(String callingcode) {
        Object[] countries = restTemplate.getForObject(url + "?callingcode=" + callingcode, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/altSpellings")
    public List<Object> getCountriesByAltSpellings(String altSpellings) {
        Object[] countries = restTemplate.getForObject(url + "?altSpellings=" + altSpellings, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/latlng")
    public List<Object> getCountriesByLatlng(String latlng) {
        Object[] countries = restTemplate.getForObject(url + "?latlng=" + latlng, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/demonym")
    public List<Object> getCountriesByDemonym(String demonym) {
        Object[] countries = restTemplate.getForObject(url + "?demonym=" + demonym, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/nativeName")
    public List<Object> getCountriesByNativeName(String nativeName) {
        Object[] countries = restTemplate.getForObject(url + "?nativeName=" + nativeName, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/numericCode")
    public List<Object> getCountriesByNumericCode(String numericCode) {
        Object[] countries = restTemplate.getForObject(url + "?numericCode=" + numericCode, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/topLevelDomain")
    public List<Object> getCountriesByTopLevelDomain(String topLevelDomain) {
        Object[] countries = restTemplate.getForObject(url + "?topLevelDomain=" + topLevelDomain, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/alpha2Code")
    public List<Object> getCountriesByAlpha2Code(String alpha2Code) {
        Object[] countries = restTemplate.getForObject(url + "?alpha2Code=" + alpha2Code, Object[].class);
        return Arrays.asList(countries);
    }

    @GetMapping("/countries/alpha3Code")
    public List<Object> getCountriesByAlpha3Code(String alpha3Code) {
        Object[] countries = restTemplate.getForObject(url + "?alpha3Code=" + alpha3Code, Object[].class);
        return Arrays.asList(countries);
    }

}
