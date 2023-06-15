package Online_Shop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cart {
    List<Product> shoppingCart = new ArrayList<>();


    // Method to add a Produkt to your shopping cart. At first, you should be able to add as much Produkts as possible.
    // Secondly, there muss be Product which are already existing in the product range.

    public void addToCart(Product product) {
        shoppingCart.add(product);
        System.out.println("The Produkt was added to the Shopping Cart.");

    }

    public void removeFromCart(int index) {
        if(index>=0 && index < shoppingCart.size()-1){
            shoppingCart.remove(index);


    }else {
            System.err.println("Invalid index. Please try again");
        }
    }
    public void getTotalPrice(){
        double totalPrice = calculateTotalPrise();
        System.out.println("The total price of your Shopping Cart is "+totalPrice + " $");

    }
    public void allOrders(){
        for (Product product:shoppingCart
             ) {
            System.out.println("Product name: " + product.getName()+ " Price: " + product .getPrice()+" $");

        }

    }
    public void getSize(){
        System.out.println(shoppingCart.size());
    }
    private double calculateTotalPrise(){
        double totalPrice = 0;
        for (Product product: shoppingCart
             ) {
            totalPrice += product.getPrice();

        }
        return totalPrice;
    }
}
