class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Main {
    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 18)
            throw new InvalidAgeException("Age must be 18 or older");
    }

    public static void main(String[] args) {
        int[] ageList = {16, 21};

        for(int age: ageList) {
            try {
                checkAge(age);
                System.out.println("Access granted");
            } catch (InvalidAgeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}
