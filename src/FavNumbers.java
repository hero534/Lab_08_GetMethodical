import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        double num2 = 0.00;
        num1 = SafeInput.getInt(in, "Enter a integer: ");
        num2 = SafeInput.getDouble(in, "Enter a double: ");
        System.out.println("Your integer is " + num1 + " and your double is " + num2);

    }
}
