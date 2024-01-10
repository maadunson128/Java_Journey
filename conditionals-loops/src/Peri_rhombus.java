import java.util.Scanner;
public class Peri_rhombus
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the side length : ");

        double side_length = in.nextDouble();

        double peri = 4*side_length;
        in.close();
         
        System.out.println("The perimeter of parallelogram : "+ peri);





    }
}