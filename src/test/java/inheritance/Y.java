package inheritance;

public class Y extends x {

    public Y() {
        super("Hello");
    }

    public Y(String string) {
        super.string=string;
    }

    public static void main(String[] args) {
        /*x x1 = new Y();
        System.out.println(x1.string);*/

        x x2=new Y("sunil");
        System.out.println(x2.string);
        System.out.println(x2.string="sidd");




    }
}
