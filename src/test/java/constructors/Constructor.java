package constructors;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Constructor extends Demo1{

    int i = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Constructor)) return false;
        Constructor that = (Constructor) o;
        return i == that.i && j == that.j && Double.compare(that.d, d) == 0 && Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, string, j, d);
    }

    String string = "";
    int j;
    double d;
    static long aLong;

    Constructor() {
        super(1001);
        this.d = 10;
        this.d = 20;
        this.d = 45;
        this.aLong = 100;

    }

    Constructor(String string) {
        super();
        this.string = string;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(c.d = 100);
        System.out.println(Constructor.aLong = 345);
        System.out.println(Constructor.aLong = 3456);

        Constructor c1 = new Constructor("Sunil");
        System.out.println(c1.string);
        System.out.println(c1.string = "Yaza");

        Constructor c2=new Constructor("Sidd");
        Constructor c3=new Constructor("Sidd");
        System.out.println(c3.equals(c2));

        System.out.println(c3.hashCode());

        System.out.println(c3.string.toString());

        List<String> list=new ArrayList();
        list.add("Sunil");
        list.add("Siddhant");
        list.add("Yazath");

        list.forEach(name-> System.out.println(name));


        List<String> list2=new ArrayList<>(list);
        list.add(3,"snad");
        System.out.println(list);

        Object[] str = list.toArray();
        System.out.println(str.length);


    }
}
