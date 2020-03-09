import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        int sum = 0;
        int n = scanner.nextInt();

        if (n < 0) {
            sum += 1;
            for (int i = n; i < 0; i++) {
                sum += i;
            }
        } else if (n > 0) {
            for (int i = n; i > 0; i--) {
                sum += i;
            }
        } else {
            sum += 1;
        }

        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.print(sum);
        printWriter.close();
    }
}
