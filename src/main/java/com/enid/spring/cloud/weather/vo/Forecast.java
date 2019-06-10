package com.enid.spring.cloud.weather.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Forecast implements Serializable {
    private static final long serialVersionUID = 4117172491387484512L;
    private String date;
    private String high;
    private String direction;
    private String low;
    private String power;
    private String type;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getDirection() {
        return direction;
    }

    @JsonProperty("fengxiang")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getPower() {
        return power;
    }

    @JsonProperty("fengli")
    public void setPower(String power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
