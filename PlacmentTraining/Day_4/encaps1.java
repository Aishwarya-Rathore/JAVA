import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String section;

    // Constructor
    Student(int r, String name, int age, String sec) {
        this.rollNo = r;
        this.name = name;
        this.age = age;
        this.section = sec;
    }

    private void study() {
        System.out.println("Don't disturb me, I am studying");
    }

    private void sleep() {
        System.out.println("Sleeping...");
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setRollNo(int r) {
        this.rollNo = r;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Public methods to access private methods
    public void callStudy() {
        study();
    }

    public void callSleep() {
        sleep();
    }
}

public class encaps1 {
    public static void main(String[] args) {
        Student s = new Student(123, "Aish", 20, "G");

        System.out.println(s.getAge());
        s.callStudy();
        s.callSleep();
    }
}

