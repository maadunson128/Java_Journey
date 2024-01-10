import java.util.Scanner;

public class Area_circle
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radiius :");
        double radius = in.nextDouble();
        in.close();

        double area = 3.14 * radius * radius ;

        System.out.println("The area of circle is  :" + area);
    }
}