package com.topsoutherncoders.countrydata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/welcome")
    public static String welcome() {
        return "index";
    }
}
