package com.enid.spring.cloud.weather.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class Weather implements Serializable {
    private static final long serialVersionUID = -564541172214056455L;
    private String city;
    private String aqi;
    private String temperature;
    private String cold;
    private Yesterday yesterday;
    private List<Forecast> forecasts;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getTemperature() {
        return temperature;
    }

    @JsonProperty("wendu")
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getCold() {
        return cold;
    }

    @JsonProperty("ganmao")
    public void setCold(String cold) {
        this.cold = cold;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    @JsonProperty("forecast")
    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }
}
