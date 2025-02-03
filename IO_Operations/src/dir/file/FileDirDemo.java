package dir.file;

import java.io.File;
import java.io.IOException;

public class FileDirDemo {

	public static void main(String[] args) {


	//	File f1 = new File("hello.txt");
		
		File f1 = new File("javeed");
		
			try {
			boolean isCreated =	 f1.mkdir();   // f1.createNewFile();
			
				
			
			
			System.out.println("Is File/Folder Created "+isCreated);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
