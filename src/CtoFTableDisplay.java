import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        int cel = 0;
        System.out.println("Celsius   Fahrenheit");
        System.out.println("-------   ----------");
        for (cel = -100; cel <= 100; cel++) {
            System.out.printf("%-10d   %-10.2f\n", cel, CtoF(cel));
        }
    }
    public static double CtoF(double Celsius) {
        return (Celsius * 1.8) + 32;
    }
}
