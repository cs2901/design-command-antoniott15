package command;

public class StereoOfCommand implements Command {

    Stereo stereo;

    public StereoOfCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.Of();
    }
}
