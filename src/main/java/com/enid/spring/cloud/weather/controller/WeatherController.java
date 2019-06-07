package com.enid.spring.cloud.weather.controller;

import com.enid.spring.cloud.weather.service.WeatherDataService;
import com.enid.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getReportByCityId(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDateByCityId(cityId);
    }

    @GetMapping("/cityName/{cityName}")
    public WeatherResponse getReportByCityName(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }
}
