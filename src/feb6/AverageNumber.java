package feb6;

import java.util.Scanner;

public class AverageNumber
{
	public static void main(String[] args) 
	{
		
		int marks[] = new int[5];
		
		float sum=0,average,percentage;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks :");
	      
		for(int i=0;i<5;i++)
		{
			marks[i] = sc.nextInt();
			sum = sum+marks[i];
			
		}
		
		average = sum/5;
		percentage = (sum/500)*100;
		
		System.out.println("average :" +average);
		System.out.println("percentgae "+percentage +" % ");
	}

}
