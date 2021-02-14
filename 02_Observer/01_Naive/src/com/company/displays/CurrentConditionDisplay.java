package com.company.displays;

public class CurrentConditionDisplay {
    private float temperature = 23;
    private float humidity = 40;
    private float pressure = 222;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display(this.temperature, this.humidity, this.pressure);
    }

    public void display(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: t=" + temperature + " h=" + humidity + " p=" + pressure);
    }
}
