import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("NOTE : Enter 0 0 to end the program \n");
        System.out.println("Enter the Grade Points and Credit of the course : ");
        double numer = 0;
        double denom = 0;
        while (true) {
            int gd_pts = in.nextInt();
            double credit = in.nextDouble();
            if(gd_pts == 0 || credit == 0)
            {
                break;
            }

            else
            {
                numer = numer+ (gd_pts * credit);
                denom = denom + credit;

            }
        }

        System.out.println("CGPA : " + (numer/denom));
    }
}
