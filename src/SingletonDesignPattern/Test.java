package SingletonDesignPattern;

public class Test {

    public static void main(String[] args) throws InterruptedException {

/*
        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton==singleton2); //true

        EagerSingleton singleton3 = EagerSingleton.getInstance();
        EagerSingleton singleton4 = EagerSingleton.getInstance();
        System.out.println(singleton3==singleton4); //true

*/

//      Multithread bir uygulamada Lazy farklı instanceları olusturdu.
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
                System.out.println("HashCode of LazySingleton: " + LazySingleton.getInstance().hashCode());
                System.out.println("HashCode of EagerSingleton: " + EagerSingleton.getInstance().hashCode());

            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("HashCode of LazySingleton: " + LazySingleton.getInstance().hashCode());
                System.out.println("HashCode of EagerSingleton: " + EagerSingleton.getInstance().hashCode());
            }
        }).start();

    }
}
