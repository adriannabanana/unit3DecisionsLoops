public class NestedLoops
{ 
    public static void loops() 
    {  
        final int limit1 = 2 ; 
        final int limit2 = 4; 
        for ( int i = 1 ;i <=  limit1 ;i++ )
        {
           for (int i2 =1; i2 <= limit2 ; i2++) 
           {
            System.out.println(i+" "+i2);
            }
        }
    }
    
    public static void whileLoops()
    {
        final int limit1 = 2;
        final int limit2 = 4;
        int i = 1;
        int i2 = 1;
        
        while (i <= limit1)
        {
            while (i2 <= limit2)
            {
                System.out.println(i + " " + i2);
                i2++;
            }
            i++;
            i2 = 1;
        }
    }
    
    public static void doLoops()
    { 
        final int limit1 = 2 ; 
        final int limit2 =4 ; 
        int i =1 ; 
        int i2 = 1; 
        do 
        { 
            do
            {
                System.out.println(i + " " + i2);
                i2++;
            }
            while (i2 <= limit2);
            
            i++;
            i2 = 1;
        }
        while (i <= limit1);
    }

}
