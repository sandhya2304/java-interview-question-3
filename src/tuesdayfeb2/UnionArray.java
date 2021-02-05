package tuesdayfeb2;

import java.util.Arrays;
import java.util.HashSet;

public class UnionArray
{
	
	public static void union(int[] ...inpytArrys)
	{
		
		System.out.println("Input....");
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		for(int[] input:inpytArrys)
		{
			System.out.println(Arrays.toString(input));
			
			for(int i:input){
				hashSet.add(i);
			}
		}
		System.out.println(hashSet);
	}
	
	public static void main(String[] args)
	{
		int[] arry1 = {1,2,3,4};
		int[] arry2 = {1};
		
		union(arry1,arry2);
		
	}

}
