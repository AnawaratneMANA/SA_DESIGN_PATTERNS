package commandPattern;

public class SwitchOffCommand implements Command{

    Light light;

    public SwitchOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }
}
