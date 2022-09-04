package OverridingEqualsAndHashCode;

import java.util.Objects;

public class Car {

    int id;
    String color;

    public Car(int id, String color) {
        this.id = id;
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && color.equals(car.color);
    }

    @Override
    public int hashCode() {

        int result = Integer.hashCode(id);

        result = result*17 + color.hashCode();

        return result;
    }



}
