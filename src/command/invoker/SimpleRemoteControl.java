package command.invoker;

import command.commands.Command;

public class SimpleRemoteControl { // invoker
    Command slot; // 커멘드가 객체화됨

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) { // 이후 객체화된 커멘드를 활용
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
