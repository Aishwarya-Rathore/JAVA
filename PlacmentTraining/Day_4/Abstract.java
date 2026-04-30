import java.util.*;

abstract class Animal{
    int no_of_legs;
    String name;

   abstract void sound(); // abstract method
   void eat(){
    System.out.println("do not disturb me i am eating"); // nonabstract method
   }
}

abstract class Bird extends Animal{
//    int  no_of_legs = 2;
   abstract void Color();
    void Fly(){
        System.out.println("do not disturb me i am flying!!!");
    }
}

class Koyal extends Bird{
    void sound(){
    System.out.println("kooo...koo...!!!");
    }
    void Color(){
        System.out.println("Black Beauty!!!");
    }
}

public class Abstract{
    public static void main(String[]args){
       Koyal a = new Koyal();
        a.eat();
        a.sound();
        a.Fly();
        a.Color();
        a.no_of_legs = 2;
        System.out.println(a.no_of_legs);
        
    }

} 