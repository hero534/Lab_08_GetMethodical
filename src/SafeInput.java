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
}
