import java.util.Scanner;
public class no11 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to TringleArea : ");
        System.out.print("Please Enter Base and Height in cm : ");
        double base = input.nextDouble();
        System.out.print("Now, enter your perpendicular height in cms : ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.print("Area of your Tringle is: " + area + " cms");

    }
}
