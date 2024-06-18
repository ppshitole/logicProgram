package stringPrograms;

public class ReverseEachWordOfString {
	
	public static void main(String[] args)
	{
		String str = "I Love My India";
		
		String[] words = str.split(" ");
		
		String rev="";
		
		for(String word:words)
			
		{
			for (int i=word.length()-1; i>0; i--)
			{
				rev=rev+word.charAt(i);
			}
			rev=rev+" ";
		}

	}

}
