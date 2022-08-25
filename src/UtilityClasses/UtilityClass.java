package UtilityClasses;

public class UtilityClass {

    // private constructor -> nesne uretilmemesi icin
    private UtilityClass(){
        throw new AssertionError();
    }

    public static int divide(int x, int y){
        return x/y;
    }
}
