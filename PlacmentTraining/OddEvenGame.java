/*Story:
Game checks numbers till 0 is entered. Count odd & even numbers.
Tag: Cognizant 2023
Input:
2 3 4 5 0
Output:*/
import java.util.*;
public class OddEvenGame{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount: ");
        double amount = sc.nextDouble();
        double balance = 5000;
        if(amount<=balance-1000){
            System.out.print("Transaction Successful!!!");
        }
        else
            System.out.print("Transaction Unsuccessful... Minimum balance violation");
        sc.close();
    }
}

