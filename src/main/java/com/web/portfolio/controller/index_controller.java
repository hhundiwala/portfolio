package com.web.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index_controller {


    @RequestMapping("/")
    public String load_index() {
        return "profile";
    }

    //I am adding this method just check the mapping of URL

    @RequestMapping("/more_info")
    public String more_info() {
        return "more_info";
    }

}


