import java.util.*;

public class FraudDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        String location = sc.next();
        int transactions = sc.nextInt();

        if((amount > 50000 && location.equalsIgnoreCase("No")) || transactions > 3) {
            System.out.println("Fraud Detected");
        } else {
            System.out.println("Safe");
        }

        sc.close();
    }
}