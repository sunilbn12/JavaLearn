package interfaces;

public interface Interface1 {

    public final int i = 0;

    default void method1() {
        System.out.println("default method");
    }

    public static void staticMethod() {
        System.out.println("static Method in interface");
    }
}
