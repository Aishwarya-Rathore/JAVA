/* create a bank class with the following attributes :- accNo, password, AccountHolder_Name, balance, And the behaviours
as follow:- withdrwa,deposite, chech_balance...you need to implement it by following encapsulation..
write geter and seter where you need it..
*/

import java.util.*;

class BankAccount {
    private int accNo;
    private String password;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accNo, String password, String name, double balance) {
        this.accNo = accNo;
        this.password = password;
        this.accountHolderName = name;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    private boolean authenticate(String pass) {
        return this.password.equals(pass);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount, String pass) {
        if (!authenticate(pass)) {
            System.out.println("Wrong password!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void checkBalance(String pass) {
        if (authenticate(pass)) {
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Wrong password!");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(101, "1234", "Aishwarya", 5000);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    acc.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    System.out.print("Enter password: ");
                    String p1 = sc.next();
                    acc.withdraw(w, p1);
                    break;

                case 3:
                    System.out.print("Enter password: ");
                    String p2 = sc.next();
                    acc.checkBalance(p2);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}