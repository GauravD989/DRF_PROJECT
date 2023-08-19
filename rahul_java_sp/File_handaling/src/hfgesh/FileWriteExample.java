package hfgesh;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter fis=new FileWriter("C:\\Users\\Itvedant CR2-9\\Desktop\\Rahul\\FileW.txt");
		fis.write("Hello Welcome ");
		fis.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
