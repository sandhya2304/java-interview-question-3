package feb5;

import java.util.Arrays;

public class AddElementArrayPosition
{
	public static void main(String[] args)
	{
		int arry[] = {4,12,9,5,3,2,1,7};
		
		int position = 2;
		int value= 24;
		
		System.out.println(Arrays.toString(arry));
		
		for(int i = arry.length-1;i>position;i--)
		{
			arry[i] = arry[i-1];
		}
		
		arry[position] = value;
		
		System.out.println(Arrays.toString(arry));
	}

}
