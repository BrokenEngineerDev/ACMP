import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));

        BigInteger max = scanner.nextBigInteger();
        while (scanner.hasNextBigInteger()) {
            max = max.max(scanner.nextBigInteger());
        }

        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.println(max);
        printWriter.close();
    }
}
