import java.util.*;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        boolean fail = false;

        System.out.println("Enter marks of 5 subjects:");

        for(int i = 1; i <= 5; i++) {
            int marks = sc.nextInt();

            if(marks < 33) {
                fail = true;
            }

            sum += marks;
        }

        if(fail) {
            System.out.println("Fail");
        } else {
            int percentage = sum / 5;

            if(percentage >= 75) {
                System.out.println("Distinction");
            } else if(percentage >= 60) {
                System.out.println("First Class");
            } else if(percentage >= 50) {
                System.out.println("Second");
            } else {
                System.out.println("Pass");
            }
        }

        sc.close();
    }
}