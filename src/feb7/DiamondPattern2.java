package feb7;

import java.util.Scanner;

public class DiamondPattern2
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows :");
		int noRows = sc.nextInt();
		
		int midRow = (noRows)/2;
		int row = 1;
		
		
		//upper half
		
		for(int i=midRow;i > 0;i--)
		{
			for(int j=1;j <=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j <= row;j++){
				System.out.print(row+" ");
			}
			System.out.println();
			
			row++;
		}
		
		//second half
		
		for(int i =0;i <= midRow;i++)
		{
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=row; j >0;j--){
				System.out.print(row+" ");
			}
			
			System.out.println();
			row--;
		}
		
		
		
	

	}

}
