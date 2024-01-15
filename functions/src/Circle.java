import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius :");
        double rad = in.nextDouble();

        System.out.println("Area: " + Area(rad));
        System.out.println("Circumference: " + Circum(rad));
    }

    static double Area(double rad) {
        double area = 3.14 * 3.14 * rad;
        return area; 
    }

    static double Circum(double rad) {
        double circum = 2 * 3.14 * rad;
        return circum; 
    }

}