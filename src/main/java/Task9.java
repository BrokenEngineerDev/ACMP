import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));

        int size = scanner.nextInt();

        int[] array = new int[size];

        int indexOfMax = 0;
        int indexOfMin = 0;

        int maxValue = 0;
        int minValue = 0;

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > 0) {
                sum += array[i];
            }

            if (i == 0) {
                maxValue = array[i];
                minValue = array[i];
                continue;
            }

            maxValue = Math.max(array[i], maxValue);
            if (maxValue == array[i]) {
                indexOfMax = i;
            }
            minValue = Math.min(array[i], minValue);
            if (minValue == array[i]) {
                indexOfMin = i;
            }
        }

        int minIndex = Math.min(indexOfMax, indexOfMin);
        int maxIndex = Math.max(indexOfMax, indexOfMin);

        int multip = 1;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            multip *= array[i];
        }
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.println(sum + " " + multip);
        printWriter.close();
    }
}
