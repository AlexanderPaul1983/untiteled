package Online_Shop;

public class OnlineShopMain {
    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.addToCart("Banana");
        cart.addToCart("Schokalade");
        cart.addToCart("Milk");
        cart.removeFromCart(1);
        cart.allOrders();

    }
}
