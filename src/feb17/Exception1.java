package feb17;

public class Exception1
{
	
	public static void main(String[] args)
	{
		
		try{
			
			int []arry = {1,2,3,5};
			System.out.println(arry[7]);
			
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			//custom msg
			System.out.println("out of boud");
		}
		System.out.println("Code ...");
		
	}

}
