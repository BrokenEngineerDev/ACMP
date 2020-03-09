import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        int size = scanner.nextInt();

        StringBuilder threeStr = new StringBuilder("");
        StringBuilder fourStr = new StringBuilder("");

        int threeCounter = 0;
        int fourCounter = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                fourStr.append(number).append(" ");
                fourCounter++;
                continue;
            }

            threeStr.append(number).append(" ");
            threeCounter++;
        }

        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.println(threeStr);
        printWriter.println(fourStr);
        printWriter.println(fourCounter < threeCounter ? "NO" : "YES");
        printWriter.close();
    }
}
