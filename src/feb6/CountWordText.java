package feb6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordText 
{
	public static void main(String[] args) throws IOException 
	{
		
		String line;
		int count = 0;
		
		FileReader file= new FileReader("D://hello1.txt");
		BufferedReader br = new BufferedReader(file);
		
		while((line = br.readLine())!=null){
			
			String[] words = line.split("");
			count = count +words.length;
			
		}
		
		
		System.out.println("Total words in text :" +count);
		br.close();
	}

}
