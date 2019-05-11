package command;

public class Stereo {
    private boolean isOf = false;
    public void  Of(){
        isOf = true;
        System.out.println("Stereo is "+isOf);
    }

    public void Close(){
        isOf = false;
        System.out.println("Stereo is "+isOf);
    }
}
