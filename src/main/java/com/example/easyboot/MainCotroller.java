package com.example.easyboot;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainCotroller {
    @RequestMapping("/")
    public String homepage(){
        return "index";
    }
}
