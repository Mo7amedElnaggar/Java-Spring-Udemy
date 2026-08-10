public class Main {

    public static void main(String [] args) {
        /// for loop
        System.out.print("For Loop:");
        for(int i = 1; i <= 5; i++) {
            System.out.print(" " + i);
        }

        /// While Loop
        System.out.print("\nWhile Loop:");
        int i = 0;
        while(i++ < 5) {
            System.out.print(" " + i);
        }

        /// Do-While Loop
        System.out.print("\nDo-While Loop:");
        i = 1;
        do {
            System.out.print(" " + i);
        } while(i++ < 5);
    }
}