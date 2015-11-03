import java.util.Scanner; 

public class Substring 
{
    public static void subString()
    { 
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter a word: " ); 
        String word = scan.next() ; 
        
        int length =  word.length(); 
        
        for (int a = 1; a <= length; a++)
        {
            for ( int i = 0; i <= (length-a) ; i++)
            {
                 System.out.println(word.substring(i, i+a));
            }
        }

    }
}
    