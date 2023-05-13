package BankSystem;

class employee extends human {
    private double salary;
    private String department;

    public employee(String Name, int Age, String Gender, double salary, String department) {
        super(Name, Age, Gender);
        this.salary = salary;
        this.department = department;
    }

    @Override
    void PrintData() {
        super.PrintData();
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: " + this.department);
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return this.department;
    }
}
