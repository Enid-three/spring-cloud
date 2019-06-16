package com.enid.spring.cloud.weather.service;

import com.enid.spring.cloud.weather.vo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private WeatherDataService weatherDataServiceImpl;

    @Override
    public Weather getDataByCityId(String cityId) {
        return weatherDataServiceImpl.getDateByCityId(cityId).getData();
    }
}
