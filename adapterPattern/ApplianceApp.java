package SoftEng1.adapterPattern;

public class ApplianceApp {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet laptopPow = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refPow = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet phonePow = new SmartphoneAdapter(smartphoneCharger);

        //plug in electronic devices
        System.out.println(laptopPow.plugIn());
        System.out.println(refPow.plugIn());
        System.out.println(phonePow.plugIn());

        System.out.println();

    }
}
