package singleton;

public class Demo {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().run().indexOf('I'));

        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();

        System.out.println(s1.equals(s2));
    }
}
