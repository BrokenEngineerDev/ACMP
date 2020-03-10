import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        int tempSum = 0;
        System.out.println(n);
        for (int i = 1; i < k; i++) {
            int j = n - i;
            while (j < k) {

                j++;
            }
        }

        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
//        printWriter.println(answer.toString());
        printWriter.close();
    }
}
