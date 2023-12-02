import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        double subtotal = 0;
        File input = new File("input.txt");
        File output = new File("output.txt");
        try (Scanner scanner = new Scanner(new FileInputStream(input))){
            Scanner sc = new Scanner(input);
            while (sc.hasNextDouble()) {
                subtotal = sc.nextDouble();
                subtotal = subtotal + subtotal;
            }
        } catch (IOException e) {

        }
        ArrayList<Double> reader = new ArrayList<Double>();


        double tax = subtotal * .053;
        double total = subtotal + tax;

        try {
            output.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fileWriter = new FileWriter(output);
            fileWriter.write("Your total is: " + total +"\r\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File should be found...");
        }
    }
}