package observer;

public class CurrentConditionDisplay implements Observer , DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData; /* in the future we
    may want to un-register ourselves as
    an observer and it would be handy
    to already have a reference to the
    subject.
    */
    public  CurrentConditionDisplay(Subject weatherData)
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
            System.out.println("Current conditions:"  + temperature
                    + "F degrees and " + humidity + "% humidity");
    }
}
