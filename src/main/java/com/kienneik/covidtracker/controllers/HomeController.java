package com.kienneik.covidtracker.controllers;

import com.kienneik.covidtracker.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CovidDataService covidDataService ;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("covidData",covidDataService.getAllStats());
        return "index";
    }
}
