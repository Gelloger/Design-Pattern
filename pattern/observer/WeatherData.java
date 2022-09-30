package pattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    ArrayList<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    private Display display1;
    private Display display2;
    private Display display3;

    public void setWeatherData(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(temperature,humidity,pressure);
        }
    }
}
