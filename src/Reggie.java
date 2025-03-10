import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = "";
        String mNumber = "";
        String menuChoice = "";
        boolean done = false;
        ssn = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        mNumber = SafeInput.getRegExString(in, "Enter you UC M Number", "^(M|m)\\d{5}$");
            while (!done) {
                menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "^[OoSsVvQq]$");
                    if (menuChoice.equalsIgnoreCase("O")) {
                        System.out.println("Your menu choise is Open!");
                        done = true;
                    } else if (menuChoice.equalsIgnoreCase("S")) {
                        System.out.println("Your menu choise is Save!");
                        done = true;
                    } else if (menuChoice.equalsIgnoreCase("V")) {
                        System.out.println("Your menu choise is View!");
                        done = true;
                    } else if (menuChoice.equalsIgnoreCase("Q")) {
                        System.out.println("Your menu choise is Quit!");
                        done = true;
                    }
            }
        System.out.println("Your SSN is " + ssn);
        System.out.println("Your M Number is " + mNumber);
        System.out.println("And your Menu Choice was " + menuChoice);
    }
}
