package feb13;

public class Recursion
{
	public static int count = 0;
	public static void my()
	{
		count++;
		if(count<=6){
			System.out.println("number :"+count);
			my();
		}
		
	}
	
	public static void main(String[] args)
	{
		my();
	}

}
