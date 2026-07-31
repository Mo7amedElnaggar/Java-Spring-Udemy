import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");
        System.out.println("Original List: " + products);

        List<String> result = products.stream()
                .filter(name -> name.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println("Filtered Products: " + result);
    }
}
