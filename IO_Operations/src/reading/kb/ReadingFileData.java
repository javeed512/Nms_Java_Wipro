package reading.kb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFileData {

	public static void main(String[] args) {
					
			

				try {
					
					FileWriter  writer = new FileWriter("Output.txt");
					
				FileReader reader = new FileReader("Input.txt");
					
				//	FileInputStream reader = new FileInputStream("Input.txt");
					
					int  n=	0;
			
					while( (n =reader.read())  != -1) 
					{
						System.out.print((char)n); // 65 66 67
						
						writer.write(n); // 65  66 67
						
						writer.flush();
						
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
	}

}
