package app;
import java.util.Map;
public class OutData {
    public void getOutput(Map<Integer, Product> map) {
        System.out.println("\nALL Product:");
        map.forEach((id, product) -> System.out.println(id+1 + ") " + product));
    }
    public void getOutput(int choice, Map<Integer, Product> map){
        System.out.println(choice +") " + map.get(choice-1));
    }
}
