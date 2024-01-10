import java.util.Scanner;

public class Area_eqtria
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Side of triangle: ");
        double side = in.nextDouble();

        double area = 0.433 * side * side;
        in.close();
        System.out.println("The area of Equivalateral traingle : "+ area);


    }
}