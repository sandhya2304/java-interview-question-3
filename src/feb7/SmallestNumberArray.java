package feb7;

public class SmallestNumberArray
{
	public static void main(String[] args)
	{
		int temp ;
		
		int arry[] = {3,7,5,6,9};
		
		int size = arry.length;
		
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arry[i] > arry[j]){
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		System.out.println("smallest number :"+arry[0]);

	}

}
