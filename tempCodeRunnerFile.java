import java.util.Scanner;

public class Noo9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("We are doing Float Multiplication");
        
        System.out.print("Please enter first decimal number: ");
        double first = input.nextDouble(); // Fixed method call
        
        System.out.print("Please enter second decimal number: ");
        double second = input.nextDouble(); // Fixed method call

        double mul = first * second;
        System.out.println("\nResult is: " + mul); // Fixed newline

        input.close(); // Closing Scanner
    }
}
