package bridgePattern;

public class Sharp implements TV{
    @Override
    public void on() {
        System.out.println("Sharp TV is Starting..");
    }

    @Override
    public void off() {
        System.out.println("Sharp TV is Shutting Down..");
    }
}
