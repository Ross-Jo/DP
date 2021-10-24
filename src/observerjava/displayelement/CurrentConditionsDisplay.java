package observerjava.displayelement;

import observerjava.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable; // observable을 가지고 있는다거나
        observable.addObserver(this); // observable에 observer를 등록해 주는 부분은 동일함
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature(); // java.util 클래스를 이용하면서 pull 방식으로 변경된 이후의 차이점. getter를 이용해 정보를 가져옴
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
