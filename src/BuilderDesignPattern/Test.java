package BuilderDesignPattern;

public class Test {

    public static void main(String[] args) {

        Computer comp = new Computer.Builder("Intel 10510U", "16GB").setGraphicCard("GTX1650").build();
        System.out.println(comp.toString());
    }
}
