public class Stringprec {
    public static void main(String[] args) {
    //     String s1 = "abc";
    //     String s2 = "Abc";
    //   for (int i = 0; i < s1.length(); i++) {
    //        System.out.println(s1.charAt(i));
    //     }

    //     System.out.println(s1 == s2); // true, because same string ek hi bar banegi..usko sab refference karenge
    //     System.out.println(s1.equals(s2)); // true, because content is the same
    //     System.out.println(s2.compareTo(s1)); // true, because content is the same ignoring case

    String s1 = new String("abc");
    String s2 = new String("abc");

    System.out.println(s1 == s2); // false, because they are different objects in the heap
   
    }
}

