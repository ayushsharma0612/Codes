package Package2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
public class ReadDataFromPDF
{
	public static void main(String[] args) throws InvalidPasswordException, IOException
	{
		File file=new File("./TextReader/Document (1).pdf");
		
		PDDocument pddoc=PDDocument.load(file);
		
		PDFTextStripper stripper=new PDFTextStripper();
		
		String text = stripper.getText(pddoc);		
		
		System.out.println(text);
		                                          
		File file1=new File("./TextReader/Dhoni.txt");
		
		FileWriter writer=new FileWriter(file1);
		
		writer.write(text);
		
		writer.close();
	}
}
 