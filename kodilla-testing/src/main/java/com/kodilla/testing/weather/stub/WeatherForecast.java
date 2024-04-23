package com.kodilla.testing.weather.stub;

import java.util.*;
public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double calculateTheAvarageTemperature() {
        Map<String, Double> temperaturesList = temperatures.getTemperatures();
        if (temperaturesList.isEmpty()) {
            return 0.0;
        }
        double sumOfTemperaturesInStations = 0;
        for (double temperature : temperaturesList.values()) {
            sumOfTemperaturesInStations += temperature;
        }
        return sumOfTemperaturesInStations / temperaturesList.size();
    }

    public double findTheMedianOfTemperatures() {
        List<Double> temperaturesList = new ArrayList<>(temperatures.getTemperatures().values());
        if (temperaturesList.isEmpty()) {
            return 0.0;
        }

        Collections.sort(temperaturesList);
        int size = temperaturesList.size();
        if (size % 2 == 0) {
            return (temperaturesList.get(size / 2 - 1) + temperaturesList.get(size / 2)) / 2;
        } else {
            return temperaturesList.get(size / 2);
        }
    }
}

/*
Napisz metodę (i test do niej), która na podstawie danych z interfejsu obliczy średnią temperaturę,
Napisz metodę (i test do niej), która na podstawie danych z interfejsu obliczy medianę temperatur.
 */