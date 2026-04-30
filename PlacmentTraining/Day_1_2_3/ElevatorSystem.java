import java.util.*;

public class ElevatorSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int current = sc.nextInt();
        int req1 = sc.nextInt();
        String dir1 = sc.next();
        int req2 = sc.nextInt();
        String dir2 = sc.next();

        if(dir1.equalsIgnoreCase("up") && req1 > current) {
            System.out.println("Next Stop = " + req1);
        } else if(dir2.equalsIgnoreCase("up") && req2 > current) {
            System.out.println("Next Stop = " + req2);
        } else if(dir1.equalsIgnoreCase("down") && req1 < current) {
            System.out.println("Next Stop = " + req1);
        } else {
            System.out.println("Next Stop = " + req2);
        }

        sc.close();
    }
}