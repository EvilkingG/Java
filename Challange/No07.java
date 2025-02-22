
import java.util.Scanner;

public class No07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("welcome to swapping Station");
        System.out.print("Enter the value of G:  ");
        int G = input.nextInt();
        System.out.print("Enter Your Value of S: ");
        int S = input.nextInt();

        int C = G;
        G = S;
        S = C;

        System.out.println("Swapping is Done Successfully");
        System.out.println("Value of S is :" + S);
        System.out.println("Value of G is :" + G);

    }
}
