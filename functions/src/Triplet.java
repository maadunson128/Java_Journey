import java.util.Scanner;

public class Triplet
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three side :");
        int side1 = in.nextInt();
        int side2 = in.nextInt();
        int side3 = in.nextInt();

        System.out.println("Pythogorean Triplet :" + pytho_trip(side1, side2, side3));
    }

    static boolean pytho_trip(int s1,int s2, int s3)
    {
        if((s1*s1)+(s2*s2) == (s3*s3))
        {
            return true;
        }
        return false;
    }

    
}