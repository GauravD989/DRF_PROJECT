package serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializationexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(101, "ABC", 57, "Daffodils");
		System.out.println(s1);
		
		try {
			FileOutputStream fis=new FileOutputStream("C:\\Users\\Itvedant CR2-9\\Desktop\\Rahul\\first123.txt");
			ObjectOutputStream os=new ObjectOutputStream(fis);
			os.writeObject(s1);
			System.out.println("Object added");
			os.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
