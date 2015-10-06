import java.text.Collator;
import java.util.*;

public class SplitString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Collection<String> subStringList = new TreeSet<String>(Collator.getInstance());
		String inputString = "Kashif";
		
		 for(int c = 0 ; c < inputString.length() ; c++ )
	      {
	         for(int i = 1 ; i <= inputString.length() - c ; i++ )
	         {
	            subStringList.add(inputString.substring(c, c+i));
	         }
	      }
		System.out.println(subStringList);
		
	}
}
