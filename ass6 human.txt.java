package BankSystem;

class human {
    private String Name;
    private int Age;
    private String Gender;

    public human(String Name, int Age, String Gender) {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }

    void PrintData() {
        System.out.println("Name: " + this.Name);
        System.out.println("Age: " + this.Age);
        System.out.println("Gender: " + this.Gender);
    }

    final void Greet() {
        System.out.println("Good Morning");
    }
}
