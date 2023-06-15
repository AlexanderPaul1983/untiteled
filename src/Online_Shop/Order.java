package Online_Shop;

import java.util.ArrayList;
import java.util.List;

public class Order extends Cart {
private Customer client;
private String order;
List<String> Order = new ArrayList<>();


    public Customer getClient() {
        return client;
    }

    public void setClient(Customer client) {
        this.client = client;
    }



    public void setOrder(String order) {
        this.order = order;
    }


    public void setNewOrder(String order){
        Order.add(order);

        System.out.println("Your order was added to the Cart");

    }
    public void getallOrders(){
        allOrders();
    }
}
