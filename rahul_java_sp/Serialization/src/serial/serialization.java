package serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		customer e1=new customer(101, "ABC", 500,"mango");
		
		try {
			FileOutputStream fis=new FileOutputStream("C:\\Users\\Itvedant CR2-9\\Desktop\\Rahul\\first123.txt");
			ObjectOutputStream os=new ObjectOutputStream(fis);
			os.writeObject(e1);
			System.out.println("Object added");
			os.close();
			fis.close();
			
			
			//Reading Object
			
			FileInputStream fis1=new FileInputStream("C:\\Users\\Itvedant CR2-9\\Desktop\\Rahul\\first123.txt");
			ObjectInputStream os1=new ObjectInputStream(fis1);
			customer eread=(customer) os1.readObject();
			System.out.println(eread);
			os1.close();
			fis1.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
