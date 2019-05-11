package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        Kitchen kitchen = new Kitchen();
        KitchenOnCommand KOn = new KitchenOnCommand(kitchen);
        KitchenOffCommand KOff = new KitchenOffCommand(kitchen);

        Celling celling = new Celling();
        CellingHighCommand CHigh = new CellingHighCommand(celling);
        CellingLowCommand CLow = new CellingLowCommand(celling);

        Garage garage = new Garage();
        GarageOpenCommand Gopen = new GarageOpenCommand(garage);
        GarageCloseCommand Gclose = new GarageCloseCommand(garage);

        Stereo stereo  = new Stereo();
        StereoCloseCommand SClose = new StereoCloseCommand(stereo);
        StereoOfCommand Sof = new StereoOfCommand(stereo);


        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(lightOff);
        remote.buttonWasPressed();

        remote.setCommand(KOn);
        remote.buttonWasPressed();
        remote.setCommand(KOff);
        remote.buttonWasPressed();

        remote.setCommand(CHigh);
        remote.buttonWasPressed();
        remote.setCommand(CLow);
        remote.buttonWasPressed();

        remote.setCommand(Gopen);
        remote.buttonWasPressed();
        remote.setCommand(Gclose);
        remote.buttonWasPressed();

        remote.setCommand(SClose);
        remote.buttonWasPressed();
        remote.setCommand(Sof);
        remote.buttonWasPressed();
    }
}
