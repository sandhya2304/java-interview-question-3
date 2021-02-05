package feb5;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateArry {

	public static void main(String[] args) 
	{
		
		Integer[] arry = {1,1,1,2,3,3,6};
		
		System.out.println(Arrays.asList(arry));
		
		HashSet<Integer> set = new HashSet<>(Arrays.asList(arry));
		System.out.println(set);
	}

}
