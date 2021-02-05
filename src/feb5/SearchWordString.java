package feb5;

public class SearchWordString {

	public static void main(String[] args) {
		
		String word = "beautiful day ";
		int index = word.indexOf("day");
		
		if(index == -1)
		{
			System.out.println("day not find");
		}else{
			System.out.println("day"+index);
		}
		

	}

}
