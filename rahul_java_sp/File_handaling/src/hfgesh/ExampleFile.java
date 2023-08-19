package hfgesh;

import java.io.File;
import java.io.IOException;

public class ExampleFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Itvedant CR2-9\\Desktop\\Rahul\\first.txt");
		try {
			if(f.createNewFile())
			{
				System.out.println("file created");
			}
			else
			{
				System.out.println("File alredy exists");
			}
			
			System.out.println("Readable ? "+f.canRead());
			System.out.println("Writable ? "+f.canWrite());
			f.delete();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
