import java.util.*;

public class DynamicPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        String demand = sc.next();
        String weekend = sc.next();

        double price = base;

        if(demand.equalsIgnoreCase("High")) {
            price += price * 0.20;
        }

        if(weekend.equalsIgnoreCase("Yes")) {
            price += price * 0.10;
        }

        System.out.println("Final Price = " + (int)price);

        sc.close();
    }
}