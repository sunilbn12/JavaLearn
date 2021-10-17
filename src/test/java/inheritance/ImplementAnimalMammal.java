package inheritance;

public class ImplementAnimalMammal {

    public static void main(String[] args) {
        Mammal m1 = new Mammal();
        System.out.println(m1.returningTye());



        Animal a1 = new Mammal();
        a1.speak();
        a1.animal1();
        m1.animal1();

        m1.mammalMethod();

        System.out.println(a1.returningTye());

    }
}
