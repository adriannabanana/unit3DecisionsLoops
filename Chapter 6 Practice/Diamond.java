import java.util.Scanner;

public class Diamond
{
    public static void formDiamond()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length you want the diamond to be: ");
        int length = scan.nextInt();
        
        int limit = 2*length +1;
        int spaces = limit/2;
        int numAsterisks = 0;

        for (int i = 0; i < length; i++)
        {
            int numAstersisks = (2*i) + 1;
            
            for (int s = 1; s < spaces; s++)
            {
                System.out.print(" ");
            }
            spaces -= 1;
            
            for (int a = 0; a <= numAsterisks; a++)
            {
                System.out.print("*");
            }

            
            System.out.println();
        }
        
        for ( int row = length -2; 
        row >= 0 ; 
        row-- 
        { 
            for ( int spaces = 0 ; 
            s[aces < sideLength 
        }
}
            