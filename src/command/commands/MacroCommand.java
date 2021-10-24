package command.commands;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }

    /**
     * 사용법
     * Command[] partyOn = {lightOn, stereoOn, tvOn, huttubOn};
     * Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};
     *
     * MacroCommand partyOnMacro = new MacroCommand(partyOn);
     * MacroCommand partOffMacro = new MacroCommand(partyOff);
     *
     * remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
     */

}
