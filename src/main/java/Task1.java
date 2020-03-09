import java.io.*;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("input.txt"));
        int sum = scanner.nextInt() + scanner.nextInt();

        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.print(sum);
        printWriter.close();
    }

}
