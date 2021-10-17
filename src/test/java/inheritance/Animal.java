package inheritance;

public class Animal {

    static int i=10;
    static String staticString="Static";
    int j=10;

    static void eat() {
        System.out.println("eat anything");
    }

    public void speak() {
        System.out.println("animal dont' speak");

    }

    public Animal returningTye() {
        return this;
    }

    public void animal1() {
    }

    ;
}
