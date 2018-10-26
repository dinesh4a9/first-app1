package com.example.spring.boot.thymeleaf.firstapp.controller;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MVCController {


    @RequestMapping({"/",""})
    public String getJoke(Model model){
        model.addAttribute("joke",new ChuckNorrisQuotes().getRandomQuote());
        return "index";
    }
}
