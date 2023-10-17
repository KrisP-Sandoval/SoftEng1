package SoftEng1.commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        //TV
        Tv tv = new Tv();
        RemoteControl rcTv = new RemoteControl();
        PowerOn powerOn = new PowerOn(tv);
        PowerOff powerOff = new PowerOff(tv);

        //Stereo
        Stereo stereo = new Stereo();
        VolumeUp volumeUp = new VolumeUp(stereo);
        VolumeDown volumeDown = new VolumeDown(stereo);

        //Lights
        Lights lights = new Lights();
        BrightnessDown brightnessDown = new BrightnessDown(lights);
        BrightnessUp brightnessUp = new BrightnessUp(lights);

        //Scenario
        System.out.println("It is evening, time to Netflix and chill ;D");
        System.out.println(powerOn.execute());
        System.out.println(volumeUp.execute());
        System.out.println(brightnessDown.execute());
        System.out.println();

        System.out.println("It is morning, time to go to school.");
        System.out.println(powerOff.execute());
        System.out.println(volumeDown.execute());
        System.out.println(brightnessUp.execute());
        System.out.println();
    }
}
