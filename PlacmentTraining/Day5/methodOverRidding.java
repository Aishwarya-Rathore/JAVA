class A{
   void add(int a, int b){
    System.out.println("Total from A class "+ (a + b));
   }
}

class B extends A{
    void add(int a, int b){
        super.add(a, b);
    System.out.println("Total From B class "+ (a + b));
   }
}

public class methodOverRidding{
    public static void main(String[]arg){
        B b = new B();
        b.add(10, 20);
    }

}