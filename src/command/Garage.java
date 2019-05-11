package command;

public class Garage {
    private boolean isOpen = false;
    public void  Open(){
        isOpen = true;
        System.out.println("Garage is "+isOpen);
    }

    public void Close(){
        isOpen = false;
        System.out.println("Garage is "+isOpen);
    }
}
