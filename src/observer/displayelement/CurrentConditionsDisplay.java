package observer.displayelement;

import observer.observer.Observer;
import observer.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement { // 관찰자 역할을 implement
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) { // 관찰자를 생성할 때 관찰대상을 주입해서 생성
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // 그리고 동시에 관찰대상에 관찰자도 등록
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
