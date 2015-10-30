import java.util.Scanner; 

public class Substring 
{
    public static void subString()
    { 
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter a word: " ); 
        String word = scan.next() ; 
        
        int length =  word.length(); 
        
        for ( int i = 0; i < length ; i++)
        {
             System.out.println(word.substring(i, i+1));
        
        
         
    }
       
    for (int i2 = 0; i2< length-1; i2++)
             {
           System.out.println(word.substring(i2, i2+2));
           
        }
    System.out.println(word); 
    
    }
}
    