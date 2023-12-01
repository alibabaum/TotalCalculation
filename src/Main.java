import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        File file = new File( "\"C:\\Users\\aliba\\Documents\\Class\\TotalCalculation\\src\\items.txt\"");
        try {
            Scanner sc = new Scanner(file);
        } catch (IOException e){

        }
        ArrayList<Double> reader = new ArrayList<Double>();
        while (itr.hasNextDouble())
            System.out.println(itr.next());
    }
}