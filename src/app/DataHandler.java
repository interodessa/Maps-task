package app;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DataHandler {
    public Map<Integer, Product> getMap(List<Product> list){
        Map <Integer,Product> productMap = new HashMap<>();
        int index = 0;
        for(Product product:list){
            productMap.put(index++, product);
        }
        return productMap;
    }
}
