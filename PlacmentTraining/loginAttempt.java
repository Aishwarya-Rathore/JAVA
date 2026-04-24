import java.util.*;
public class loginAttempt{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int code = 342;
        int count=1;
        
        do{
            System.out.print("enter the password :");
        int pasword = sc.nextInt();
            if(pasword==code){
                System.out.println("successful");
                break;
            }
            else{
                System.out.println("unsuccessful");
            }
             if(count == 3){
                System.out.println("login block:");
                break;
            }
            count++;
        }while(count<=3);

    }
}