package feb7;

public class AllSubsetString 
{
	public static void main(String[] args)
	{
		
		String word = "laugh";
		int length = word.length();
		int temp = 0;
		
		String arry[] = new String[length*(length+1)/2];
		
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length;j++){
				arry[temp] = word.substring(i, j+1);
				temp++;
			}
		}
		
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]);
		}
	}

}
