import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number and the power :");

        int ans = 1;
        int num = in.nextInt();
        int pow = in.nextInt();

        for(int i=0;i<pow;i++)
        {
            ans = ans * num;
        }

        System.out.println(ans);
    }
    
}
