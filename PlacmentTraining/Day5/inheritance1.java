class Car {
    String color;
    String model;
    String brand;
    int mileage;
    int no_of_gears;

    Car(String color, String model, String brand, int mileage, int no_of_gears) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.no_of_gears = no_of_gears;
    }

    void applyBrake() {
        System.out.println("Breaking");
    }

    void applySpeed() {
        System.out.println("Speed....");
    }

    void shiftGear() {
        System.out.println("Shifting gear....");
    }
}

class Verna extends Car {
    int capacity;

    Verna(String color, String model, String brand, int mileage, int no_of_gears, int capacity) {
        super(color, model, brand, mileage, no_of_gears);
        this.capacity = capacity;
    }

    void airbags() {
        System.out.println("Airbags");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        Verna v = new Verna("Black", "Second Top", "HYUNDAI", 15, 6, 5);
        v.airbags();
        v.applyBrake();
        v.applySpeed();
        v.shiftGear();
        System.out.println(v.model);
        System.out.println(v.mileage);
        System.out.println(v.no_of_gears);
        System.out.println(v.brand);
        System.out.println(v.color);
        System.out.println(v.capacity);
        

    }
}