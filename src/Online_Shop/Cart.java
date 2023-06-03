package Online_Shop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cart {
    List<String> shoppingCart = new ArrayList<>();

    // Method to add a Produkt to your shopping cart. At first, you should be able to add as much Produkts as possible.
    // Secondly, there muss be Product which are already existing in the product range.

    public void addToCart(String yourChoice) {
        shoppingCart.add(yourChoice);
        System.out.println("The Produkt was added to the Shopping Cart.");

    }

    public void removeFromCart(int index) {
        shoppingCart.remove(index);

    }
    public void getPrice(){
        System.out.println("The total price of your Shopping Cart is "+Product.getTotalPrice() + " $");

    }
    public void allOrders(){
        System.out.println(shoppingCart);

    }
    public void getSize(){
        System.out.println(shoppingCart.size());
    }
}
