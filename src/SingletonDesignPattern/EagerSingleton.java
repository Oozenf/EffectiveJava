package SingletonDesignPattern;

public class EagerSingleton {

    // static member
    private static EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton(){

    }

    // static factory method
    public static EagerSingleton getInstance(){
        return instance;
    }
}
