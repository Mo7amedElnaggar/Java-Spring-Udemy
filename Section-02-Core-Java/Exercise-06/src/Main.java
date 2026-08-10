public class Main {

    public static void main(String [] args) {
        int numbers[] = {45, 22, 89, 16, 90, 33};
        int smallest = numbers[0], largest = numbers[0];

        for(int number : numbers) {
            smallest = smallest > number ? number : smallest;
            largest = largest < number ? number : largest;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
