package inheritance;

public class Mammal extends Animal {

    int j=10;
    static int i=1001;
    static String staticString="Static";

    Mammal(){
        super.i=100;
    }


    @Override
    public void speak() {
        System.out.println("Mammal dont' speak");
        super.i=100;
        this.i=100012;


    }

    public Mammal returningTye() {
        return this;
    }

    public void mammalMethod() {
        System.out.println("mammal class method");
    }
}
