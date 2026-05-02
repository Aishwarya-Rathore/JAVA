import java.util.*;
public class ZeroOneTriangle{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the num of row ");
     int n = sc.nextInt();
     int num = 1;
     for(int i=0;i<n;i++){
        int count = num;
        for(int j=0;j<=i;j++){
            System.out.print(count +" ");
            if(count==1){
                count=0;
            }
            else{
                count=1;
            }
        }
        System.out.println();
        if(num==1){
             num=0;
            }
            else{
             num=1;
            }
    }
  
    sc.close();
} 
}