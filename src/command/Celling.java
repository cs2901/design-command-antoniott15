package command;

public class Celling {
        private boolean isOn = false;
        public void  Hight(){
            isOn = true;
            System.out.println("Celling Fan is "+isOn);
        }

        public void Low(){
            isOn = false;
            System.out.println("Celling Fan is "+isOn);
        }

    }

