import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
        hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.println("You were born at " + hour + ":" + minute + " on " + month + " " + day + " " + year);
    }
}
