/*Story:
Fare:
• First 5 km → ₹50/km 
• Next 5 → ₹40/km 
• Beyond → ₹30/km
Night → +20% 
Tag: Uber 2023
Input:
Distance = 12
Night = Yes*/ 
import java.util.*;

public class Uber2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Distance: ");
        int distance = sc.nextInt();

        System.out.print("Is it night? Enter Y or N: ");
        char n = sc.next().charAt(0);

        int fare;

        if (distance <= 5) {
            fare = distance * 50;
        } else if (distance <= 10) {
            fare = 5 * 50 + (distance - 5) * 40;
        } else {
            fare = 5 * 50 + 5 * 40 + (distance - 10) * 30;
        }

        if (n == 'Y' || n == 'y') {
            fare += (fare * 20) / 100;
        }

        System.out.print("Final Fare: " + fare);
        sc.close();
    }
}