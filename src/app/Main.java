package app;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        DataHandler handler = new DataHandler();
        OutData outputer = new OutData();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice!=3){
        System.out.println("Make a choice:\n1) Print all products\n2) Print one product\n3) Exit");
        choice = scanner.nextInt();
        switch (choice){
            case 1: outputer.getOutput(handler.getMap(provider.getProductList()));
                break;
            case 2:
                System.out.println("input number from the list");
                int secondChoice = scanner.nextInt();
                outputer.getOutput(secondChoice, handler.getMap(provider.getProductList()));
                break;
        }
    }
    }
}

