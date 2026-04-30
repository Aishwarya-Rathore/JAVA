import java.util.*;
public class traffic{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the speed of vehical :");
        int speed = sc.nextInt();
        System.out.print("repeted violance?  only y=1 or n=0:");
        int c = sc.nextInt();
        int fine = 0;
        if(speed>100){
            fine = 500;
        }
        else if(speed>80){
            fine = 1000;
        }
        if(c == 1){
            fine = fine*2;
        }
        System.out.print("fine is:"+ fine);

    }
}