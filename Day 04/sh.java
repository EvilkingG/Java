import java.util.Scanner;

public class sh {
    public static void main(String[] args) {
        int S = 72;
        Scanner input = new Scanner(System.in);
        // Taking input from user 5 Numbers
        int G1 = input.nextInt();
        S = S + G1;
        System.out.println("Sum : " + S);
        int G2 = input.nextInt();
        S = S - G2;
        System.out.println("Sub : " + S);
        int G3 = input.nextInt();
        S = S * G3;
        System.out.println("Multiply : " + S);
        int G4 = input.nextInt();
        S = S / G4;
        System.out.println("Divide : " + S);
        int G5 = input.nextInt();
        S = S % G5;
        System.out.print("Mod : " + S);

    }
}
