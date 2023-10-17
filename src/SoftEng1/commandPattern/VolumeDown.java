package SoftEng1.commandPattern;

public class VolumeDown implements Command{
    private Stereo stereo;

    public VolumeDown(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public String execute() {
        return stereo.volumeDown();
    }
}
