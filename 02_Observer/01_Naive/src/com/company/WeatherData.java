package com.company;

import com.company.displays.CurrentConditionDisplay;

public class WeatherData {
    private float temperature = 23;
    private float humidity = 40;
    private float pressure = 222;

    private CurrentConditionDisplay currentConditionDisplay;

    public WeatherData(CurrentConditionDisplay currentConditionDisplay) {
        this.currentConditionDisplay = currentConditionDisplay;
    }

    public void measurementsChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        this.currentConditionDisplay.update(temperature, humidity, pressure);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }
}
