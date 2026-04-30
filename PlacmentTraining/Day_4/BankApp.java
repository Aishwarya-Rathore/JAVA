class BankAccount {
    private int accNo;
    private String password;
    private String name;
    private double balance;

    public BankAccount(int accNo, String password, String name, double balance) {
        this.accNo = accNo;
        this.password = password;
        this.name = name;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount, String pass) {
        if (password.equals(pass) && amount <= balance) {
            balance -= amount;
        }
    }

    public double checkBalance(String pass) {
        if (password.equals(pass)) {
            return balance;
        }
        return -1;
    }
}

public class BankApp  {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, "1234", "Aish", 5000);
  
        b.deposit(1000);
        b.withdraw(2000, "1234");

        System.out.println(b.checkBalance("1234"));
    }
} 