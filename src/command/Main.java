package command;

import command.commands.LightOnCommand;
import command.invoker.SimpleRemoteControl;
import command.receivers.Light;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(); // invoker
        Light light = new Light(); // receiver
        LightOnCommand lightOnCommand = new LightOnCommand(light); // command

        simpleRemoteControl.setCommand(lightOnCommand); // invoker에 command 설정
        simpleRemoteControl.buttonWasPressed(); // invoker를 통해 command 실행. 종국적으로 receiver가 동작
    }
}
