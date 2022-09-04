package OverridingEqualsAndHashCode;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car(1,"red");
        Car car2 = new Car(1,"red");
        Car car3 = new Car(1,"blue");

        // car1.equals(car2);  true
        // car1.hashCode() == car2.hashCode();  true

        // car1.equals(car3);  false
        // car1.hashCode() == car3.hashCode();  false

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);


        System.out.println(cars.size()); // 2 , car1 ve car2 ayni. Set degerleri unique olmalidir.

        System.out.println(cars.contains(new Car ( 1 , "blue"))); // true , equals override edilmezse false olur.
    }
}
