public class methodOverload {
    static int add(int a, int b,int c) {
        return a + b + c;
    }
    static int add(int a, int b) {
        return (int)(a + b);
    }
    public static void main(String[] args) {
       System.out.println(add(10,20,30)); // Calls the first method
       System.out.println(add(10,20)); // Calls the second
    }
}   