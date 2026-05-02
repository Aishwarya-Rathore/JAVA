import java.util.*;
public class PalindromTri{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of Ractangle: ");
     int n = sc.nextInt();
     for(int i=1;i<=n;i++){
       for(int j=n;j>i;j--){
        System.out.print(" ");
       }
       for(int k=i;k>=1;k--){
             System.out.print(k);
         }
         for(int l=2;l<=i;l++){
                System.out.print(l);
        }
        System.out.println();
     }
     sc.close();
        
    }

} 