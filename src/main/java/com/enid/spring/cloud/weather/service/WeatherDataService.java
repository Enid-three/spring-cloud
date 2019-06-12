package com.enid.spring.cloud.weather.service;

import com.enid.spring.cloud.weather.vo.WeatherResponse;

public interface WeatherDataService {

    /**
     * 根据城市ID查询天气数据
     * @param cityId
     * @return
     */
    WeatherResponse getDateByCityId(String cityId);

    /**
     * 根据城市名称查询天气数据
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);

    /**
     * 根据城市ID同步天气数据
     * @param cityId
     */
    void syncDataByCityId(String cityId);
}
