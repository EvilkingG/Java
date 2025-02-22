import java.util.Scanner;

public class Sum {

    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Welocme to our calculator");
        System.out.print("Please Enter Your First Number:");
        int FirstNumber = input.nextInt();
        System.out.print("Please Enter Your Second Number:");
        int SecondNumber  = input.nextInt();
        int sum = FirstNumber + SecondNumber;
        System.out.print("Sum of your Number is : " + sum);
    }
}
