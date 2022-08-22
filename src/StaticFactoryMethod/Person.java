package StaticFactoryMethod;

public class Person {

    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public static Person createStudentWithDefaultEmail(String name){
        return new Student(name,name + "@gmail.com");
    }

    public static Person createWithDefaultEmail(String name){
        return new Person(name,name + "@gmail.com");
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
