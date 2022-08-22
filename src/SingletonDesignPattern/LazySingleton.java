package SingletonDesignPattern;

public class LazySingleton {

    // static member
    private static LazySingleton instance;

    // private constructor
    private LazySingleton(){

    }

    // static factory method
    public static LazySingleton getInstance(){

        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
