
import java.util.Scanner;

public class Arithmetic {

    // Scanner object removed from here
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of G:  ");
        int G = input.nextInt();
        System.out.print("Enter Your Value of S: ");
        int S = input.nextInt();

        // (int G = 86;
        // int S = 72;)
        // Adding two numbers
        System.out.println("Sum : " + (G + S));
        // Subtracting two numbers
        System.out.println("Difference : " + (G - S));
        // Multiplying two numbers
        System.out.println("Product : " + (G * S));
        // Dividing two numbers
        System.out.println("Quotient : " + (G / S));
        // Remainder of two numbers
        System.out.println("Remainder : " + (G % S));

        double x = 8.6;
        double y = 7.2;

        // Adding two numbers
        System.out.println("Sum : " + (x + y));
        // Subtracting two numbers
        System.out.println("Difference : " + (x - y));
        // Multiplying two numbers
        System.out.println("Product : " + (x * y));
        // Dividing two numbers
        System.out.println("Quotient : " + (x / y));
        // Remainder of two numbers
        System.out.println("Remainder : " + (x % y));
    }
}
