package command;

public class Kitchen {
    private boolean isOn = false;
    public void  On(){
        isOn = true;
        System.out.println("Kitchen light is "+isOn);
    }

    public void Off(){
        isOn = false;
        System.out.println("Kitchen light is "+isOn);
    }
}
