public class FindFirstClass

{
    // returns the index of the first space in the specified strubg if -1 if the string conains
    // no spaces
    
    public static int findFirstSpace(String str)
    {
        boolean found = false'choi
        int position = 0;
        
        while (!found && position <str.length())
        char ch = str.charAt(position);
        if (ch == ' ')
        {
            {
            found = true;
        }
        
            else
        {
         position ++
        }
    }
    
    if (!found)
    {position = -1;
    }
}
}