import java.util.*;

interface UPI {
    default void payment() {
        System.out.println("Payment done using UPI");
    }
}

interface CreditCard {
    default void payment() {
        System.out.println("Payment done using Credit Card");
    }
}

interface DebitCard {
    default void payment() {
        System.out.println("Payment done using Debit Card");
    }
}

class Payment implements UPI, CreditCard, DebitCard {
    public void payment(int choice) {
        switch (choice) {
            case 1:
                UPI.super.payment();
                break;
            case 2:
                CreditCard.super.payment();
                break;
            case 3:
                DebitCard.super.payment();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

public class UPICard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.UPI 2.CreditCard 3.DebitCard");
        int choice = sc.nextInt();
        Payment p = new Payment();
        p.payment(choice);
    }
}