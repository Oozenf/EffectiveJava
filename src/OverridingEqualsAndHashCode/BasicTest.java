package OverridingEqualsAndHashCode;

public class BasicTest {

    public static void main(String[] args) {

        String n1 = "Ali";
        String n3 = new String("Ali");

        System.out.println(n1 == n3); // false, referanslari farkli.
        System.out.println(n1.equals(n3));  // true, String class'inda equals methodu override ediliyor.

        // **********************************************

        System.out.println('a' == 'b');  // false
        System.out.println('a' == 97.0); // true
        System.out.println((int) 'a');  // 97
        System.out.println('a' + 1 == 'b'); // true


    }
}
