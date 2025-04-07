package filehandling;

import java.io.File;
import java.io.IOException;

public class FolderDemo1 {

	public static void main(String[] args) throws IOException {

	File f1=new File("C:\\Users\\apoor\\OneDrive\\Pictures\\Screenshots\\march19");
			
	System.out.println(f1.mkdir());	
			System.out.println("end of program");
		
	}

}
