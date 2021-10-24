package observer;

import observer.displayelement.CurrentConditionsDisplay;
import observer.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        // 관찰대상의 상태를 바꿀때마다 관찰자가 이를 감지해서 변경된 상황을 표기함
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
