import java.util.Scanner;
public class Peri_parall
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the slide length and base length : ");

        double slide_length = in.nextDouble();
        double base = in.nextDouble();

        double peri = 2*(slide_length+base);
        in.close();
         
        System.out.println("The perimeter of parallelogram : "+ peri);





    }
}