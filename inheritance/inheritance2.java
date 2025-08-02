class human1 {
    int age;
    //private String name;

    human1() {
        System.out.println("human name constructor");
    }

    void sleep() {
        age = 18;
        System.out.println("human sleep");
        System.out.println(age);
    }
}

class student extends human1 {
    void disp() {
        System.out.println("the age is " + age);
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        student s = new student();
        s.disp();   // Line 26 (from error)
        s.sleep();
    }
}

