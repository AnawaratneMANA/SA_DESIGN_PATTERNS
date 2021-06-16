package commandPattern;

public class KitchenRoomLight implements Light{

    String light;

    public KitchenRoomLight(String light) {
        this.light = light;
    }

    @Override
    public void on() {
        System.out.println("Turning on " + light);
    }

    @Override
    public void off() {
        System.out.println("Turning off " + light);
    }
}
