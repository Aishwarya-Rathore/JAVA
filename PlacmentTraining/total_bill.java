import java.util.*;
public class total_bill{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed : ");
        double Unit = sc.nextDouble();
        double bill = 0.0;
        if(Unit<=100){
            bill = (Unit*1.5)+50;
        }
        else if(Unit<=200){
            bill =  ((100*1.5)+(Unit-100)*3.5)+50;
        }
        else{
            bill = ((100*1.5)+(100*3.5)+(Unit-200)*5)+50;
        }
        if(bill>2000){
            bill = bill*1.1;
        }
        System.out.println("Total Bill : "+ bill);
        sc.close();
    }
}