import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int min = num1;
        if(num1>num2)
        {
            min = num2;
            
        }
        int hcf=0;
        for(int i=min;i!=0;i--)
        {
            if(num1%i == 0 && num2%i == 0)
            {
                hcf = i;
                break;

            }
        }
        System.out.println("HCF : "+ hcf);

    }
    
}
