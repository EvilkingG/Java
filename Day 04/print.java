
import java.util.Scanner;

public class print {

    public static void main(String[] args) {
        System.out.print("Enter Your Name:  ");
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        System.out.println("Hello " + S);

    }
}
