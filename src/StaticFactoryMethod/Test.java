package StaticFactoryMethod;

public class Test {

    // "Static factory method is simply a static method that returns an instance of a class." Effective Java, Joshua Bloch.
    // Anlasilabilir isimlendirme.
    // Her cagrildiginda yeni bir nesne olusturmaya gerek kalmaz.
    // Subclass inin bir nesnesini de dondurebilir.
    // String, boolean, optional, collections gibi java classlarinda ornekleri var.
    public static void main(String[] args) {

        Person person1 = Person.createWithDefaultEmail("Ali");
        System.out.println(person1.toString());

        Person person2 = Person.createStudentWithDefaultEmail("Ayşe");
        System.out.println(person2.getClass());

    }
}
