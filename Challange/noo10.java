import java.util.Scanner;

public class noo10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Personalized Calculator : ");
        System.out.print("Please Enter All 4 sides in cm : ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        double fourth = input.nextDouble();
        double perimeter = first + second + third + fourth;
        System.out.print("Perimeter of your Rectangle is: " + perimeter + " cm");
    }
}