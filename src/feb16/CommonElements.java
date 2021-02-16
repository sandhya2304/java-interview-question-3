package feb16;

public class CommonElements 
{
	public static void main(String[] args)
	{
		int arry1[] = {2,5,8,9,3};
		int arry2[] = {1,6,0,11,3};
		
		for(int i=0;i<arry1.length;i++){
			for(int j=0;j<arry2.length;j++){
				if(arry1[i] == arry2[j]){
					System.out.println(arry1[i]);
				}
			}
		}
		
		
	}

}
