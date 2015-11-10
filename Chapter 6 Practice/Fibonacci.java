import java.util.Scanner;

public class Fibonacci
{
    public static void printFibonacci()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        int fold1 = 1;
        int fold2 = 1;
        int foldn = 0;
        
        for (int i = 0; i < (n-2); i++)
        {
            foldn = fold1+fold2;
            fold2 = fold1;
            fold1 = foldn;
        }
        
        System.out.print(foldn);
        System.out.print("❃");
    }
}
            