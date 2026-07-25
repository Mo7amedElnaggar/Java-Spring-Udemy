class Manager extends Employee {
    private String department;

    Manager(String name, Double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Department: " + this.department;
    }
}
