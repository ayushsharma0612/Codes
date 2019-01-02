package Package2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadDataFromText
{
	public static void main(String[] args) throws IOException {
		
		String TestFile="./TextReader/Text.txt";
		
		File fc=new File(TestFile);                                    
		
		FileReader fr=new java.io.FileReader(TestFile);
		
		BufferedReader br=new BufferedReader(fr);
		
		String content="";  
		
		while((content=br.readLine())!=null)
			
		{
			System.out.println(content);
		}
		br.close();
	}
}