package tuesdayfeb1;

public class CopyArray 
{
	public static void main(String[] args)
	{
		
		int[] arry1 = {1,2,3,4,5,6};
		int[] arry2 = new int[arry1.length];
		
		for(int i=0;i<arry1.length;i++)
		{
			arry2[i] = arry1[i];
		}
		
		
		
		for(int i=0;i<arry1.length;i++){
			System.out.print(arry1[i]);
		}
		

		for(int i=0;i<arry2.length;i++){
			System.out.print(+arry2[i]);
		}


	}

}
