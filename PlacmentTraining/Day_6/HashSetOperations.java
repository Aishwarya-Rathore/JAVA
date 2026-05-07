import java.util.*;
public class HashSetOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int ele = sc.nextInt();
        while(ele!=0){
            set.add(ele);
            ele = sc.nextInt();
        }
        System.out.println("printing...");
        for(int i:set){
            System.out.println(i);
        }
        sc.close();
}
}


// list down atleast 5 functions and use them in a separete program for the following:-
// 1. ArrayList
// 2. HashSet
// 3. HashMap