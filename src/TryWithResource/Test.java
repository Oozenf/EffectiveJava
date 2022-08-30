package TryWithResource;

import java.io.*;
import java.util.Scanner;

public class Test {

    // The try-with-resources statement automatically closes all the resources at the end of the statement
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(new File("src/TryWithResource/testRead.txt"));
             PrintWriter writer = new PrintWriter(new File("src/TryWithResource/testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException in try block =>" + e.getMessage());
        }

    }
}
