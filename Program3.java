package net.codejava.io;
 
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("MyFile.txt");
            int character;
            char c='';
	    StringBuilder str = new StringBuilder("");
            int i=0;
            while ((character = reader.read()) != -1) {
		
                c=(char) character;
		if(c!=',')
		{
		  str.insert(i,c);
		  i++;	
		}
		else
		{
		  break;
		}	

            }
	    System.out.println(str.toString());
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}