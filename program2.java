// Java Program to add two numbers
// without using arithmetic operator
import java.io.*;
 
class Program2
{
    static int Addition(int x, int y)
    {
        
        while (y != 0) 
        {
            
            int c = x & y;
 	    x = x ^ y;
 	    y = c << 1;
        }
        return x;
    }
     
    
    public static void main(String arg[]) 
    {
        System.out.println(Addition(10, 30));
    }
}