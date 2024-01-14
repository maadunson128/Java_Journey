import java.util.Scanner;

public class Leap
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if (year%100 == 0) {
            if (year%400 == 0) {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not Leap Year");
            }
        }
        else
        {
            if(year%4 == 0)
            {
                System.out.println("Leap year");
            }
            else
            {
                System.out.println("Not Leap year");
            }
        }
    }
}