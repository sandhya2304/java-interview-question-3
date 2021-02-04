package feb7;

public class CountVowelConstant
{
	public static void main(String[] args)
	{
		
		String word = "hello world";
		
		int vCount=0,cCount = 0;
		
		for(int i=0; i < word.length();i++)
		{
			if(word.charAt(i)=='a' || word.charAt(i)=='e' ||word.charAt(i)=='i' ||word.charAt(i)=='o' ||word.charAt(i)=='u'){
				vCount++;
			}else if(word.charAt(i) >= 'a' || word.charAt(i) <= 'z'){
				cCount++;
			}
		}
		
		System.out.println("number of vowels :"+vCount);
		System.out.println("number of constant :"+cCount);
	}

}
