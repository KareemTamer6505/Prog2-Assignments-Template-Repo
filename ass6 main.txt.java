package BankSystem;

public class Main {
    public static void main(String[] args) {
        employee emp = new employee("John", 30, "Male", 5000, "Finance");
        customer cust = new customer("Jane", 25, "Female", "123-45-6789", "123 Main St.");
        BankAccount acc = new BankAccount();

        emp.PrintData();
        emp.Greet();
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());

        cust.PrintData();
        cust.Greet();
        System.out.println("SSN: " + cust.SSN);
        System.out.println("Address: " + cust.Address);

        acc.setBalance(500);
        System.out.println("Balance: " + acc.getBalance());
        acc.setBalance(1000, 10);
        System.out.println("Balance: " + acc.getBalance());

        cust.getAccount().setBalance(1000);
        System.out.println("Balance: " + cust.getAccount().getBalance());
    }
}
