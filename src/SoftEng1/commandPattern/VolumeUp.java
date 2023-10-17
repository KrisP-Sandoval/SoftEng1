package SoftEng1.commandPattern;

public class VolumeUp implements Command{
    private Stereo stereo;

    public VolumeUp(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public String execute() {
        return stereo.volumeUp();
    }
}
