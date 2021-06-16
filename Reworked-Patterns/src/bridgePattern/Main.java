package bridgePattern;

public class Main {
    public static void main(String[] args) {
        new RemoteControllerImpl(new Sharp()).on();
        new RemoteControllerImpl(new LG()).off();
        new RemoteControllerImpl(new Sharp()).on();
        new RemoteControllerImpl(new LG()).off();
    }
}
