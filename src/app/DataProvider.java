package app;
import java.util.ArrayList;
import java.util.List;
public class DataProvider {
    public List<Product> getProductList(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 20, 999.99));
        products.add(new Product("Phone", 150, 500));
        products.add(new Product("Notebook", 100, 1500));
        products.add(new Product("Tablet", 80, 800));
        return products;
    }
}
