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