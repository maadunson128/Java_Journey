import java.util.Scanner;


public class Test{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        
        int num = in.nextInt();
        int orin = num;
        int power=0;
        int tempnum = orin;

        while(tempnum>0)
        {
            tempnum=tempnum/10;
            power++;
        }

        int res=0;
        int tem = 0;
        double sum = 0;
        tempnum = orin;

        while(tempnum>0)
        {
            tem = tempnum%10;
            sum = sum + Math.pow(tem,power);
            tempnum= tempnum/10;
        }

        if(sum==orin)
        {
            System.out.println(orin);
            System.out.println("Arm number");
        }
        else
        {
            System.out.println("No");
        }

    }
}