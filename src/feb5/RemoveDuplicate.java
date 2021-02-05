package feb5;

import java.util.ArrayList;

public class RemoveDuplicate
{
	
	public static void main(String[] args)
	{
		
		ArrayList<String> al =new ArrayList<>();
		al.add("mango");
		al.add("orange");
		al.add("mango");
		al.add("grapes");
		al.add("mango");
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++){
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println(al);
	}

}
