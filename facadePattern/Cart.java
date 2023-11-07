package SoftEng1.facadePattern;

public class Cart implements HotelService {
    private int numberOfCarts;
    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void performService() {
        requestCart(numberOfCarts);
    }
    private void requestCart(int numberOfCarts) {
        if (numberOfCarts > 1) {
            System.out.println("Requested " + numberOfCarts + " luggage carts.");
        }
        if (numberOfCarts == 1) {
            System.out.println("Requested " + numberOfCarts + " luggage cart.");
        }
        else {
            System.out.println(numberOfCarts + " luggage cart requested.");
        }
    }
}
