
import java.util.Scanner;

public class no08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.print("Pleas Enter Your First Number: ");
        int firstnum = input.nextInt();
        System.out.print("Pleas Enter Your Second Number: ");
        int Secondnum = input.nextInt();

        int add = firstnum + Secondnum;
        int Sub = firstnum - Secondnum;
        int Mul = firstnum * Secondnum;
        int Div = firstnum / Secondnum;
        int Mod = firstnum % Secondnum;
        int Inc = firstnum++;
        int Dec = firstnum--;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + Sub);
        System.out.println("Multiplication: " + Mul);
        System.out.println("Division: " + Div);
        System.out.println("Modulus: " + Mod);
        System.out.println("Increment: " + Inc);
        System.out.println("Decrement: " + Dec);


    }

}
