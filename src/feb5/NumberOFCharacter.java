package feb5;

public class NumberOFCharacter {

	public static void main(String[] args) {
		
	    String word = "Hello beautiful";
	    int count =0;
	    
	    for(int i=0;i<word.length();i++){
	    	if(Character.isLetter(word.charAt(i))){
	    		count++;
	    	}
	    }
	
	    System.out.println(count);
	}

}
