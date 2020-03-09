import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task6 {
    public static String YES = "YES";
    public static String NO = "NO";
    public static String ERROR = "ERROR";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        String input = scanner.nextLine();
        String result = checkTransition(input);


        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        printWriter.println(result);
        printWriter.close();
    }

    public static class Step {
        char letter;
        char number;

        public Step(String step) {
            this.letter = step.charAt(0);
            this.number = step.charAt(1);
        }

        public boolean isValidStep() {
            return letter >= 65 && letter <= 72 && number >= 49 && number <= 56;
        }

        public static boolean canMakeStep(Step start, Step finish) {
            int letterTransition = Math.abs(start.letter - finish.letter);
            int numberTransition = Math.abs(start.number - finish.number);
            if (letterTransition == 0 && numberTransition == 0) {
                return true;
            }

            if (letterTransition == 1 && numberTransition == 2) {
                return true;
            } else return letterTransition == 2 && numberTransition == 1;
        }
    }


    public static String checkTransition(String input) {
        if (input == null || input.isEmpty() || !input.contains("-") || input.length() != 5) {
            return ERROR;
        }

        String[] steps = input.split("-");
        Step step1 = new Step(steps[0]);
        if (!step1.isValidStep()) {
            return ERROR;
        }
        Step step2 = new Step(steps[1]);
        if (!step2.isValidStep()) {
            return ERROR;
        }

        return Step.canMakeStep(step1, step2) ? YES : NO;
    }

}
