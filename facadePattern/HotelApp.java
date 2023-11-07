package SoftEng1.facadePattern;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        // Example usages
        frontDesk.valetService("FALL1N1");
        frontDesk.houseKeepingService(2705);
        frontDesk.cartService(0);
    }
}
