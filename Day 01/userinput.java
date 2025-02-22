
import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pleas Enter your name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + " Pleas Enter Your Age: ");
        int age = input.nextInt();
        System.out.println("Your Age is: " + age);

    }
}
