import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        System.out.println("Original List: " + names);

        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();

        for(int i = 0; i < names.size(); i++) {
            hashMap.put(names.get(i), i);
        }

        System.out.println("Unique Names: " + hashMap.keySet());
    }
}
