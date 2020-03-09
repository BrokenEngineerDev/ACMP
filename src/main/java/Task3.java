import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        long num = (long) Math.pow(scanner.nextLong(), 2);
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.print(num);
        printWriter.close();
    }
}
