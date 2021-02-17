package feb17;

public class MultipleCatch
{
	public static void main(String[] args)
	{
		
		try
		{
			int arry[] = {1,2,3};
			arry[7] = 3/0;
		}catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException a)
		{
			a.printStackTrace();
		}
		
		System.out.println("rest code ...");
		
	}

}
