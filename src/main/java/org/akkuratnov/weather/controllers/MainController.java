package org.akkuratnov.weather.controllers;

import org.akkuratnov.weather.repo.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class MainController {
    private final WeatherRepo messageRepo;

//    @Value("${spring.profiles.active}")
//    private String profile;

    @Autowired
    public MainController(WeatherRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @GetMapping
    public String main(Model model) {
        HashMap<Object, Object> data = new HashMap<>();

        data.put("weathers", messageRepo.findAll());

        model.addAttribute("frontendData", data);
        model.addAttribute("isDevMode", true);

        return "index";
    }
}
