package feb16;

import java.util.ArrayList;

public class CovertArrayListToArry
{
	public static void main(String[] args) 
	{
		ArrayList<String> arry = new ArrayList<>();
		arry.add("mango");
		arry.add("apple");
		
		String[] my = new String[arry.size()];
		
		arry.toArray(my);
		for(String s:my){
			System.out.println("Arrays :"+s);
		}

	}

}
