package feb5;

public class StringRotation
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = "def";
		
		if(s1.length() != s2.length())
		{
			System.out.println("length not equal");
		}else{
			
			s1 = s1.concat(s1);
			
			if(s1.indexOf(s2) != -1)
			{
				System.out.println("yes rotation");
			}else{
				System.out.println("No Rotation");
			}
			
			
		}
		

	}

}
