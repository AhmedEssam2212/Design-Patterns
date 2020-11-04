package observer;

public class HeatIndexDisplay implements Observer , DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;
    public HeatIndexDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public void display() {
        float heatIndex = humidity * temperature;
        System.out.println("Heat index is :" + heatIndex);

    }




}
