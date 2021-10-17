package interfaces;

public class Demo1 implements I1 {
    @Override
    public void abstracMethod1() {

    }

    static void staticMethod() {
        System.out.println("staticMethod in Demo1");
    }

    public static void main(String[] args) {
        I1.staticMethod();


        I1 i1=new Demo1();
        i1.defaultMethod2();
        i1.abstracMethod1();
    }
}
