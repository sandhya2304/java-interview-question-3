package feb7;

public class AddMatrix {

	public static void main(String[] args) {
		
		int rows = 2, cols = 3;
		
		int[][] first = {{1,2,3},{5,3,1}};
		int[][] second = {{9,1,6},{1,3,2}};
		
		int sum[][] = new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++){
				sum[i][j] = first[i][j] + second[i][j];
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++){
				System.out.print(sum[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
