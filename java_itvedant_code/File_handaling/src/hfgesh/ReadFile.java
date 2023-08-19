package hfgesh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//C:\Users\Itvedant CR2-9\Desktop\Rahul\abc.txt
	try {
		
	FileInputStream fis=new FileInputStream("C:\\Users\\Itvedant CR2-9\\Desktop\\Rahul\\abc.txt");
	
	int i=0;
	
	while((i=fis.read())!=-1)
	{
	System.out.print((char)i);
	}
	fis.close();
	
	}catch(FileNotFoundException e) {
		System.out.println(e);
		System.out.println("File not Found");
	}catch(IOException e) {
		System.out.println("File not closed");
	}

	}
}

