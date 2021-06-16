package commandPattern;

public class Main {
    public static void main(String[] args) {
        //Creating the Remote Controller.
        RemoteController remoteController = new RemoteController();

        //Creating Two Lights.
        Light livingRoomLight = new LivingRoomLight("Living Room Light");
        Light kitchenRoomLight = new KitchenRoomLight("Kitchen Room Light");

        //Creating Commands for the Lights.
        SwitchOnCommand switchOnCommandLiving = new SwitchOnCommand(livingRoomLight);
        SwitchOffCommand switchOffCommandLiving = new SwitchOffCommand(livingRoomLight);

        SwitchOnCommand switchOnCommandKitchen = new SwitchOnCommand(kitchenRoomLight);
        SwitchOffCommand switchOffCommandKitchen = new SwitchOffCommand(kitchenRoomLight);

        //Add the Commands to the Remote Controller created previously. - Living Room Light
        remoteController.setCommmands(switchOnCommandLiving, switchOffCommandLiving);

        //Execute the Remote Controller methods. - Living Room Light
        remoteController.onButtonPressed();
        remoteController.OffButtonPressed();

        //Add the Commands to the Remote Controller created previously. - Kitchen Room Light
        remoteController.setCommmands(switchOnCommandKitchen, switchOffCommandKitchen);

        //Execute the Remote Controller methods. - Kitchen Room Light
        remoteController.onButtonPressed();
        remoteController.OffButtonPressed();

    }
}
