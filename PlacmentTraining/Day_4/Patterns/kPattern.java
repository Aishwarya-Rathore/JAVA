import java.util.*;
public class kPattern{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of Ractangle: ");
     int n = sc.nextInt();
     // First Half
     for(int i=n;i>0;i--){
        for(int j=i;j>0;j--){
            System.out.print("* ");
        }
        System.out.println();
     }
    // Second Half
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
     }

     sc.close();
        
    }

} 