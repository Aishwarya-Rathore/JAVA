import java.util.*;
public class SmartcityTraffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
      int[] arr = {4,8,15,3,10,12,5,9};
      int Sum =0;
      int max=0;
      for(int i=0;i<k;i++){
        Sum+=arr[i];
      }
      max = max<Sum?Sum:max;
        for(int i=k;i<arr.length;i++){
            Sum+=arr[i];
            Sum-=arr[i-k];
           max = max<Sum?Sum:max;
        }
        System.out.println(max);
        sc.close();
    }
}