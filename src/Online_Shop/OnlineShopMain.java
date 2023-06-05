package Online_Shop;

public class OnlineShopMain {
    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.addToCart("Banana");
        cart.addToCart("Schokalade");
        cart.addToCart("Milk");
        
        cart.allOrders();
        Product papier = new Product("Klopapier",2.45f,"Toalett");
        Product banana = new Product("Banana",2.68f,"Fruits");
        Product schocolate = new Product("Schocolate",3.55f,"Candies");
        Product milk = new Product("Milk",1.20f,"Milk producs");
        cart.getPrice();

    }
}
