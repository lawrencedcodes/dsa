package com.topsoutherncoders.countrydata;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping(value = "/home")
    public static String welcome() {
        return "index";
    }
}
