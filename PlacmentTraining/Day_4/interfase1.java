interface Animal {
    void Sound();

    default void eat() {
        System.out.println("Eating...");
    }
}

interface Bird extends Animal {
    void Fly();

    default void Sleep() {
        System.out.println("Sleeping re baba!!...");
    }
}

class Sparrow implements Bird {
    public void Sound() {
        System.out.println("Chirpping..");
    }

    public void Fly() {   
        System.out.println("Udta hi firuuu!!..");
    }
}

public class interfase1 {
    public static void main(String[] args) {
        Sparrow a = new Sparrow();

        a.Sound();
        a.eat();
        a.Fly();
        a.Sleep(); 
    }
}