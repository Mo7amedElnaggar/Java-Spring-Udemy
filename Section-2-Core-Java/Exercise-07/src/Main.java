class Main {

    public static void main(String [] args) {
        Employee employee = new Employee("Alice", 50000.0);
        Manager manager =  new Manager("Bob", 80000.0, "IT");

        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());
    }
}