class Employee {
    private String name;
    private Double salary;

    Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}
