package Online_Shop;

public class Product {
    private String name;
    private float price;
    private String category;
    private static float totalPrice = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public static float getTotalPrice() {
        return totalPrice;
    }

    public Product(String name, float price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
