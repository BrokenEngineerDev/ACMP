import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        int number = scanner.nextInt();
        int result = (number * 100) + 90 + (9 - number);
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.print(result);
        printWriter.close();
    }
}
