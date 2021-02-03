package wedfeb3;

import java.util.Arrays;

public class RotationArray 
{
	
	public static void leftRotate(int[] input,int num)
	{
		
		System.out.println("before Rotate :" +Arrays.toString(input));
		
		int temp;
		
		for(int i=0;i<num;i++)
		{
			temp = input[0];
			for(int j=0;j<input.length-1;j++){
				input[j] = input[j+1];
			}
			
			input[input.length-1] = temp;
		}
		
		System.out.println("After Rotate :" +Arrays.toString(input));
	}
   
	
	public static void main(String[] args)
	{
		
		leftRotate(new int[]{1, 2,3,4,5,6},3);

	}

}
