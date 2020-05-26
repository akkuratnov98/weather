package org.akkuratnov.weather.controllers;

import org.akkuratnov.weather.domain.Weather;
import org.akkuratnov.weather.repo.WeatherRepo;
import org.aspectj.bridge.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("weather")
    public class WeatherController {

        private final WeatherRepo weatherRepo;

        @Autowired
        public WeatherController(WeatherRepo weatherRepo) {
            this.weatherRepo = weatherRepo;
        }

        @GetMapping
        public List<Weather> showDevices() {
            Weather weather = new Weather();
            weather.setTemperature(5);
            weather.setCreationDate(LocalDateTime.now());
            weatherRepo.save(weather);
            return weatherRepo.findAll();
        }

}
