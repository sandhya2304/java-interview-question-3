package wedfeb3;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String word = sc.nextLine();
		
		String rev = "";
		
		int length = word.length()-1;
		
		for(int i=length;i >=0; i--)
		{
			rev = rev +word.charAt(i);
		}
		
		if(word.equals(rev)){
			System.out.println("Palindrome :"+word);
		}else{
			System.out.println("Palindrome Not :"+word);
		}
		
	}

}
