package feb6;

import java.util.Scanner;

public class DiscountDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price :");
		int price = sc.nextInt();
		
		System.out.println("Enter the discount :");
		int discount = sc.nextInt();
		
		int finalPrice = (price * discount)/100;
		System.out.println("final price : "+finalPrice);
		

	}

}
