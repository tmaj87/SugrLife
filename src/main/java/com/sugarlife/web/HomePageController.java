package com.sugarlife.web;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomePageController {

    @RequestMapping("/")
    public String homePage() {
        return "homePage";
    }

}
