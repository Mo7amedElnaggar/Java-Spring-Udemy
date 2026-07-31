class Main {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        try {
            int result = numerator / denominator;
        } catch(ArithmeticException exp) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Program completed");
        }
    }
}
