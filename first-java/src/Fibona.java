import java.util.Scanner;

public class Fibona
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int first = 0;
        int sec = 1;
        int i = 2;
        int next = 0;

        while(i<=num)
        {
            next = first+sec;
            first = sec;
            sec = next;
            i++;

        }
        System.out.println(next);
    }
}