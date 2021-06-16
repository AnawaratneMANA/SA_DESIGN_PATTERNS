package bridgePattern;

public class RemoteControllerImpl implements RemoteController{

    TV tv;

    public RemoteControllerImpl(TV tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        this.tv.on();
    }

    @Override
    public void off() {
        this.tv.off();
    }
}
