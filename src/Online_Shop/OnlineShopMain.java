package Online_Shop;

public class OnlineShopMain {
    public static void main(String[] args) {

        // Problems: 1. The price is not going to remove if one product was deleted from the Cart
        //           2. The Product, which was added to the Order, does not appear in the Cart
        Product banana = new Product("Banana",2.0f,"Fruits");
        Product milk = new Product("Milk",3.0f,"Milkproducts");
        Cart cart = new Cart();
        cart.addToCart(banana);
        cart.addToCart(milk);
        cart.allOrders();
        cart.getTotalPrice();



        




    }
}
