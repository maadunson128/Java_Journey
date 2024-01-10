import java.util.Scanner;

public class Area_triangle
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base and height of triangle : ");
        double base = in.nextDouble();
        double height = in.nextDouble();
        in.close();
        double area = 0.5 * base * height ;
        System.out.println("The area of triangle : " + area);
    }
}