 import java.util.*;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        // int n=5;
        // int[] arr = {10,20,30,40,50};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        int n=5;
        int[] arr = new int[] {10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
         
        System.out.println("Enter the element of the array");
        int [] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}