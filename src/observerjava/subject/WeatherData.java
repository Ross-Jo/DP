package observerjava.subject;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    /**
     * observer 들을 관리해 주는 부분들은 모두 빼도 됨. Observable이 담당하고 있기 때문.
     * Observable의 경우 deprecated가 되었는데 어떤 대체 클래스가 있는지 알아볼 것
     */
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged(); // Observable에서 제공하는 메소드. notifyObservers 호출전 state가 변경되었다는 점을 알리기 위해 먼저 호출해야 함
        notifyObservers(); // 이제 Observable에서 제공하는 메소드를 사용함 => 그리고 각 observer들은 본 객체에서 pull 방식으로 데이터를 읽어감
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
