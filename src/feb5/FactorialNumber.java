package feb5;

public class FactorialNumber
{
	public static void main(String[] args)
	{
		
		int fact = 1;
		int number = 6;
		
		for(int i=1;i<number;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Number "+number+" : "+fact);
	}

}
