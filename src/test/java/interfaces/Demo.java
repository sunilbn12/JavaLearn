package interfaces;

public class Demo implements Interface1 {

    @Override
    public void method1() {
        System.out.println("default method in Demo class");
    }

    public static void main(String[] args) {
        Interface1 i1 = new Demo();
        Interface1.staticMethod();
        i1.method1();

        Demo d1 = new Demo();
        d1.method1();


    }
}
