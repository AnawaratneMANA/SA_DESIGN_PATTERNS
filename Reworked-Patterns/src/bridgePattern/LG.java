package bridgePattern;

public class LG implements TV {
    @Override
    public void on() {
        System.out.println("LG TV is Starting..");
    }

    @Override
    public void off() {
        System.out.println("LG TV is Shutting down..");
    }
}
