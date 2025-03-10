import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.00;
        double sum = 0.00;
        boolean more = true;
            while (more) {
                itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
                sum = sum += itemPrice;
                more = SafeInput.getYNConfirm(in, "Do you want to enter more items? Enter [Y or N]");
            }
        System.out.printf("The sum of your items is " + sum);
    }
}
