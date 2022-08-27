package GarbageCollector;

            // Object created inside a method
public class Test {

    String name;

    public Test(String name){
        this.name = name;
    }

    static void createObject(){
        Test obj1 = new Test("Object 1");
    }

    public static void main(String[] args) {
        createObject();

        System.gc();

    }

    protected void finalize()
    {
        System.out.println("Successfully garbage collected." );
    }
}
