package com.company;

import com.company.displays.CurrentConditionDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new CurrentConditionDisplay());

        float newTemperature = 24;
        float newHumidity = 41;
        float newPressure = 223;

        weatherData.setMeasurements(newTemperature, newHumidity, newPressure);
        weatherData.setMeasurements(newTemperature + 1, newHumidity + 1, newPressure + 1);
    }
}
