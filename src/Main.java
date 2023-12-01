import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        double subtotal = 0;
        File input = new File("input.txt");
        File file = new File("output.txt");
        try {
            Scanner sc = new Scanner(file);
        } catch (IOException e) {

        }
        ArrayList<Double> reader = new ArrayList<Double>();

        while (sc.hasNextLine) {
            subtotal = sc.hasNextDouble();
            subtotal = subtotal + subtotal;
        }
        double tax = subtotal * .053;
        double total = subtotal + tax;

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(output.txt);
            FileWriter fileWriter = new FileWriter(output);
        } catch (IOException e) {
            System.out.println("File should be found...")
        }
    }
}