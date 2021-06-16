package commandPattern;

public class SwitchOnCommand implements Command{

    Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
