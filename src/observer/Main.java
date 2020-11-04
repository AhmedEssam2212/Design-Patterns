package observer;

public class Main {
    public static void main(String[] args) {
           WeatherData weatherData = new WeatherData();
           CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
           StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
           ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
           HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
           weatherData.setMeasurements(40.0f, 22.0f, 10.98f);
           currentConditionDisplay.display();
           statisticsDisplay.display();
           forecastDisplay.display();
           heatIndexDisplay.display();

    }
}
