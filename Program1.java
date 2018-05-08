public class Program1
{
   public void reverseWordString(String str)
   {
	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = words.length-1; i >= 0; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
   }
   public static void main(String[] args) 
   {
	Program1 objProgram1 = new Program1();
	objProgram1.reverseWordString("Java test");
	
   }
}