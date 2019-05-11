package command;

public class CellingHighCommand implements Command{

    Celling celling;

    public CellingHighCommand(Celling celling) {
        this.celling = celling;
    }

    @Override
    public void execute() {
        celling.Hight();
    }
}
