package GarbageCollector;

            // Nullifying the reference variable
public class Test3 {

    public static void main(String[] args) {

        Test3 obj = new Test3();

        obj = null;

        System.gc();
    }

    protected void finalize(){
        System.out.println("Successfully garbage collected.");
    }
}
