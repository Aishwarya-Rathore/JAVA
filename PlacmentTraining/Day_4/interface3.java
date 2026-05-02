interface A {
   public static final int x = 10;   
    void showA();
}

interface B {
   public static final int y = 20;  
    void showB();
}

class Test implements A, B {
    public void showA() {
        System.out.println("Value of x: " + x);
    }

    public void showB() {
        System.out.println("Value of y: " + y);
    }
}

public class interface3 {
    public static void main(String[] args) {
        Test t = new Test();
        t.showA();
        t.showB();
    }
}

/*implement a class payment that implements 3 interfaces 
upi:-in this interface we are having a default method payment...
credit card:-in this interface we are having a default method payment..
debit card:-in this interface we are having a default method payment..
now accept a payment method from tha main class orr main func. and implement its payment function
*/