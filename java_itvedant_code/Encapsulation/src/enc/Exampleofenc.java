package enc;


class employee
{
	private String name;
	//Setter method
	public void setName(String Tname)
	{
		this.name=Tname;
	}
	//Getter method
	public String getName()
	{
		return this.name;
	}
	
	private int id;
	public void setId(int Sid)
	{
		this.id=Sid;
	}
	
	public int getId()
	{
		return this.id;
	}
	
}
public class Exampleofenc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e1=new employee();
		e1.setName("ABC");
		System.out.println(e1.getName());
		
		e1.setId(19);
		System.out.println(e1.getId());
		

	}

}
