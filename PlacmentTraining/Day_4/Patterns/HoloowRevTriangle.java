import java.util.*;

public class HoloowRevTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

       for (int i = n; i >= 1; i--) {

            // spaces (for centering)
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            // stars and hollow logic
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}