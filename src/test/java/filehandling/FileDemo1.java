package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {

	File f1=new File("C:\\Users\\apoor\\OneDrive\\Pictures\\Screenshots\\Mar19th.txt");
			
	f1.createNewFile();
	
			System.out.println("end of program");
		
	}

}
