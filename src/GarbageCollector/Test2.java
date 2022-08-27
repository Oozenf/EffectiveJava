package GarbageCollector;

                // Reassigning the reference variable
public class Test2 {

    String name;

    public Test2(String name){
        this.name = name;
    }

    public static void main(String[] args) {

        Test2 obj1 = new Test2("Object 1");
        Test2 obj2 = new Test2("Object 2");

        obj1 = obj2;

        System.gc();
    }

    protected void finalize()
    {
        System.out.println("Successfully garbage collected." );
    }


}
