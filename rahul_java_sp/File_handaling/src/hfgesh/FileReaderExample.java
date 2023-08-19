package hfgesh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fis=new FileReader("C:\\Users\\Itvedant CR2-9\\Desktop\\Rahul\\abc.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
