package SoftEng1.facadePattern;

public class FrontDesk {
    public void valetService(String plateNumber) {
        HotelService valet = new Valet(plateNumber);
        valet.performService();
    }

    public void houseKeepingService(int roomNumber) {
        HotelService houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.performService();
    }

    public void cartService(int numberOfCarts) {
        HotelService cart = new Cart(numberOfCarts);
        cart.performService();
    }
}
