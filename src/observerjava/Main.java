package observerjava;

import observer.displayelement.CurrentConditionsDisplay;
import observer.subject.WeatherData;

public class Main {
    /**
     * jdk에서 기본적으로 주어지는 observer/observable 인터페이스를 사용하는 경우는 앞선케이스와 가장 차이나는 점이
     * setChanged() 함수를 사용하는지 여부임
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        // 관찰대상의 상태를 바꿀때마다 관찰자가 이를 감지해서 변경된 상황을 표기함
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
