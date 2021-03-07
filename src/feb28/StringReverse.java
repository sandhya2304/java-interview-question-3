package feb28;

public class StringReverse
{
	public static void main(String[] args)
	{
		String words = "sandhya";
		
		char[] ch = words.toCharArray();
		
		for(int i= ch.length-1 ;i>=0;i--){
			System.out.print(ch[i]);
		}

	}

}
