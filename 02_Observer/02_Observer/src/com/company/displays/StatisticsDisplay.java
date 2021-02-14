package com.company.displays;

import com.company.interfaces.DisplayElement;
import com.company.interfaces.Observable;
import com.company.interfaces.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature = 23;
    private float humidity = 40;
    private float pressure = 222;
    private Observable weatherData;

    public StatisticsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics: t=" + temperature + " h=" + humidity + " p=" + pressure);
    }
}
