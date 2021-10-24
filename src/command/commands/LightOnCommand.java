package command.commands;

import command.receivers.Light;

public class LightOnCommand implements Command { // command
    Light light;

    public LightOnCommand(Light ligth) { // receiver를 인자로 넘겨주어 설정
        this.light = ligth;
    }

    @Override
    public void execute() { // 커멘드가 실행되었을때, receiver를 어떻게 호출해야 하는지 기술
        light.on();
    }

    @Override
    public void undo() {
        light.off(); // undo의 경우는 execute의 반대로직을 기술한다
    }
}
