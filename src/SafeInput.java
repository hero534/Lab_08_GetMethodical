import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash + ", Please enter an integer.");
            }
        }
        while (!done);
        return result;
    }
    public static double getDouble(Scanner pipe, String prompt) {
        double result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash + ", Please enter a number.");
            }
        }
        while (!done);
        return result;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int lo, int hi) {
        int result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print(prompt + "[" + lo + " - " + hi + "]: ");
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                if (result >= lo && result <= hi) {
                    done = true;
                } else {
                    System.out.println("You must enter a value in range [" + lo + " - " + hi + "]: " + result);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a int between [" + lo + " - " + hi + "]: " + trash);
            }
        }
        while (!done);
        return result;
    }
}
