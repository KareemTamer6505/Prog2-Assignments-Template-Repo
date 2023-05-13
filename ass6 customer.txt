package BankSystem;

class customer extends human {
    private String SSN;
    private String Address;
    private BankAccount account;

    public customer(String Name, int Age, String Gender, String SSN, String Address) {
        super(Name, Age, Gender);
        this.SSN = SSN;
        this.Address = Address;
        this.account = new BankAccount();
    }

    public BankAccount getAccount() {
        return this.account;
    }
}
