package command.receivers;

public class Light {
    String location = "";

    public Light() {
    }

    public void on() {
        System.out.println(location + "light is on");
    }

    public void off() {
        System.out.println(location + "light is off");
    }
}
