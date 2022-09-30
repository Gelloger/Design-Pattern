package pattern.observer;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        WeatherData weatherData = new WeatherData();
        Display display = new CurrentDisplay(weatherData);
        weatherData.setWeatherData(30,20,40);
    }
}
