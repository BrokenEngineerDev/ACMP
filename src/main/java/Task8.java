import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.println((a * b == scanner.nextInt()) ? "YES" : "NO");
        printWriter.close();
    }
}
