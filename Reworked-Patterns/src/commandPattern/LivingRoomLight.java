package commandPattern;

public class LivingRoomLight implements Light{
    String light;

    public LivingRoomLight(String light) {
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
