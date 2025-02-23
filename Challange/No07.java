
// Write a program to swap two numbers without using a third variable.

import java.util.Scanner;

public class No07 {

    public static void main(String[] args) {
        // Take Input from User
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swapping Station");
        System.out.print("Enter the value of G:  ");
        int G = input.nextInt();
        System.out.print("Enter Your Value of S: ");
        int S = input.nextInt();
        // Create a Temporary Variable store the value of G

        int C = G;
        G = S;
        S = C;
         // Now call the value of G and S
        System.out.println("Swapping is Done Successfully");
        System.out.println("Value of S is :" + S);
        System.out.println("Value of G is :" + G);

    }
}
