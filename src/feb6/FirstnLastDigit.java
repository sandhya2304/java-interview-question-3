package feb6;

public class FirstnLastDigit
{
	public static void main(String[] args)
	{
		
		int number = 12345;
		int first = 0;
		int last =0;
		
		last = number % 10;
		
		System.out.println("last :"+last);
		
		while(number != 0)
		{
			first = number % 10;
			number /= 10;
		}
		
		
		System.out.println("first :"+first);
	}

}
