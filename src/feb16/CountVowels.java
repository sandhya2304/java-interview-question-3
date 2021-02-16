package feb16;

public class CountVowels 
{

	public static void main(String[] args)
	{
		String word = "hello beautiful";
		word = word.toLowerCase();
		
		int count =0;
		
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
					word.charAt(i) == 'o' ||word.charAt(i) == 'u' 
			 ){
				count++;
			}
		}
		System.out.println("vowels are : "+count);
	}

}
