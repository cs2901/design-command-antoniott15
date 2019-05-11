package command;

public class CellingLowCommand implements Command{

        Celling celling;

        public CellingLowCommand(Celling celling) {
            this.celling = celling;
        }

        @Override
        public void execute() {
            celling.Low();
        }


}
