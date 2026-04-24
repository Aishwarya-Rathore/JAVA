import java.util.*;
public class parking{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double hours = sc.nextDouble();
        double bill = 0.0;
        if(hours<=2){
            bill = hours*100;
        }
        else if(hours<=5){
            bill = 2*100+(hours-2)*50;
        }
        else{
            bill = 2*100+3*50+(hours-5)*25;
        }
        System.out.println("Total Bill : "+ bill);
        sc.close();
    }
}