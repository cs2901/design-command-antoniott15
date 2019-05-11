package command;

public class StereoCloseCommand implements Command {


    Stereo stereo;

    public StereoCloseCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.Close();
    }
}
