package pattern.observer;

public class CurrentDisplay implements Observer, Display{
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float preesure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Condition: "+ temperature + "`C degrees and " + humidity +"% humidity.");
    }
}
