package app;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class OutData {
    public void getOutput(Map<Integer, Product> map) {
        AtomicInteger number = new AtomicInteger(1);
        System.out.println("\nALL Product:");
        map.forEach((id, product) -> System.out.println(number.getAndIncrement() + ") id:" + id + "-" + product));
    }
    public void getOutput(int choice, Map<Integer, Product> map){
        System.out.println("id:" + choice + " - " + map.get(choice));
    }
}
