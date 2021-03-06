package observer;

public class StatisticsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    public  StatisticsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;

    }
    @Override
    public void display() {
        System.out.println(" Statistics :"  + temperature
                + "F degrees  ");
    }


}
