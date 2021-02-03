package wedfeb3;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels
{
	
	public static String remove(String word)
	{
		
		Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		
		List<Character> list = Arrays.asList(vowels);
		StringBuffer sb = new StringBuffer(word);
		
		for(int i=0; i <sb.length();i++){
			if(list.contains(sb.charAt(i))){
				sb.replace(i,i+1,"");
				i--;
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args)
	{
		String words = "Hello World";
		System.out.println(remove(words));

	}

}
