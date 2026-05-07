/*in an online cinema booking system, there are N seates in a row, represented as an array of0s and 1s (0=empty, 1=booked)....you need to find the longest stretch of consecutive empty seats(os), so that a lasrge family can sit together.
Ex:- seats =[1,0,0,0,1,0,0] O/P =3    (the longest stretch of empty seats) */

import java.util.*;
public class CinemaBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seats = new int[n];
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }
        int maxEmpty = 0;
        int currentEmpty = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                currentEmpty++;
                maxEmpty = Math.max(maxEmpty, currentEmpty);
            } else {
                currentEmpty = 0;
            }
        }
        System.out.println(maxEmpty);
        sc.close();
    }
}