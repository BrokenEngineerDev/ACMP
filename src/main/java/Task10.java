import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));

        int firstCoef = scanner.nextInt();
        int secondCoef = scanner.nextInt();
        int thirdCoef = scanner.nextInt();
        int forthCoef = scanner.nextInt();

        StringBuilder answer = new StringBuilder();

        for (int i = -100; i < 101; i++) {
            if ((firstCoef * Math.pow(i, 3)) + (secondCoef * Math.pow(i, 2)) + (thirdCoef * i) + forthCoef == 0) {
                answer.append(i).append(" ");
            }
        }


        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.println(answer.toString());
        printWriter.close();
    }
}
