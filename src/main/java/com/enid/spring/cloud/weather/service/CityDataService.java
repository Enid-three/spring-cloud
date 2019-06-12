package com.enid.spring.cloud.weather.service;

import com.enid.spring.cloud.weather.vo.City;

import java.util.List;

public interface CityDataService {
    List<City> listCity() throws Exception;
}
