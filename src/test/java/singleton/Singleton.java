package singleton;

public class Singleton {
    static Singleton singleton;
    private Singleton() {

    }

    public static Singleton getInstance(){
        if(singleton==null){
           synchronized (Singleton.class){
               singleton=new Singleton();
           }
        }

        return singleton;
    }

    public String run(){

        return "In singleton class";
    }

    public void run1(){

    }
}
