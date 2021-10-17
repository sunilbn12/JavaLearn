package constructors;

public class Demo1 {

   static int i;

    protected Demo1(int i1){

        this.i=100;

        System.out.println("default constructor");

        this.i=i1;
        System.out.println(i);

    }

    public Demo1() {

    }

    public static void main(String[] args) {

    }


}
