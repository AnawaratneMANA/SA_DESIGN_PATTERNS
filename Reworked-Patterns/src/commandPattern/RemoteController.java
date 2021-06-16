package commandPattern;

public class RemoteController {
    Command SwitchOnCommand;
    Command SwitchOffCommand;

    public void setCommmands (Command switchOnCommand, Command switchOffCommand) {
        SwitchOnCommand = switchOnCommand;
        SwitchOffCommand = switchOffCommand;
    }

    public void onButtonPressed(){
        this.SwitchOnCommand.execute();
    }

    public void OffButtonPressed(){
        this.SwitchOffCommand.execute();
    }
}
