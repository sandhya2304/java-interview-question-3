package feb10;

public class LargestThirdNumber
{
	
	public static int getLargest(int []arry,int total)
	{
		int temp;
		
		for(int i=0;i<arry.length;i++)
		{
			for(int j = i+1;j <arry.length;j++){
				if(arry[i] > arry[j]){
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		return arry[total-3];
		
	}
	
	public static void main(String[] args)
	{
		int arry[] = {1,5,3,9};
		System.out.println("Third large :"+getLargest(arry, 4));
	}

}
