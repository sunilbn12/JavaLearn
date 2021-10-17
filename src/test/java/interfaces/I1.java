package interfaces;

public interface I1 extends I2{

    public default void method() {
        System.out.println("Default method in I1");
    }

    static void staticMethod() {
        System.out.println("staticMethod in I1");
    }

    abstract public void abstracMethod1();

    int i = 10;
    String str = "String";

    @Override
    default void defaultMethod2() {
        System.out.println("Overriden default method2");
        I2.super.defaultMethod2();
    }
}
