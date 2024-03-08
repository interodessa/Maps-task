package app;
public class Product {
    private final String name;
    private final int quantity;
    private final double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public String toString() {

        return name + ", quantity:" + quantity + ", price:" + price;
    }
}

