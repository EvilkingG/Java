
import java.util.Scanner;

public class no9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("We are doing Float Multiplication\n");
        System.out.print("Please enter first decimal number: ");
        double first = input.nextDouble();
        System.out.print("Pleas Enter Second Number: ");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("Result is : " + mul);
    }
}
