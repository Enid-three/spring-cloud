package com.enid.spring.cloud.weather.service;

import com.enid.spring.cloud.weather.vo.Weather;

public interface WeatherReportService {

    Weather getDataByCityId(String cityId);
}
