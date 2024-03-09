package app;
import java.util.HashMap;
import java.util.Map;

public class DataProvider {
    public Map<Integer,Product> getProductList(){
        HashMap<Integer,Product> products = new HashMap();
        products.put(1, new Product("TV", 20, 999.99));
        products.put(2, new Product("Phone", 150, 500));
        products.put(3, new Product("Notebook", 100, 1500));
        products.put(4, new Product("Tablet", 80, 800));
        return products;
    }
}
