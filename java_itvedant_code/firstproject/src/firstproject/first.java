/*
//single level inheritance==20-06-2023
package firstproject;
class a{
	public void show() 
	{
		System.out.println("A class method");
	}
	public void add(int a,int b)
	{
		System.out.println("add: "+(a+b));
	}
}

class b extends a
{
	public void sub(int a, int b)
	{
		System.out.println("sub: "+(a-b));
		
	}
}
public class first {
	public static void main(String[]args) {
		
		b obj=new b();
		obj.show();
		obj.add(15,25);
		obj.sub(24,12);
	}
}*/
/*
//multilevel inheritance==20-06-2023
package firstproject;
class a{
	public void show() 
	{
		System.out.println("A class method");
	}
	public void add(int a,int b)
	{
		System.out.println("add: "+(a+b));
	}
}

class b extends a
{
	public void sub(int a, int b)
	{
		System.out.println("sub: "+(a-b));
		
	}
}
class c extends b
{
	public void mul(int a, int b)
	{
		System.out.println("mul: "+(a*b));
		
	}
}
class d extends c
{
	public void div(int a, int b)
	{
		System.out.println("div: "+(a/b));
		
	}
}
public class first {
	public static void main(String[]args) {
		
		d obj=new d();
		obj.show();
		obj.add(15,25);
		obj.sub(24,12);
		obj.mul(41,5);
		obj.div(15,5);
	}
}*/

// inheritance==20-06-2023
package firstproject;
class employee{
	int id;
	String name;
}

class Regemployee extends employee
{
	int salary;
	int bonus;
	public void displaydetails()
	{
		System.out.println("Id: "+this.id+ " Name: "+this.name +" Salary: "+this.salary+" Bonus: "+this.bonus);
	}
}
class contractemployee extends employee
{
	int pay_per_hour;
	int weekly_pay;
	public void displaydetails()
	{
		System.out.println("Id: "+this.id+ " Name: "+this.name +" Pay par hour: "+this.pay_per_hour+" Weekly Pay: "+this.weekly_pay);
	}
}

public class first {
	public static void main(String[]args) {
		
		Regemployee reg=new Regemployee();
		reg.id=101;
		reg.name="abc";
		reg.salary=10000;
		reg.bonus=5000;
		System.out.println(reg.id);
		System.out.println(reg.name);
		System.out.println(reg.salary);
		System.out.println(reg.bonus);
		reg.displaydetails();
		
		contractemployee con=new contractemployee();
		con.id=102;
		con.name="xyz";
		con.pay_per_hour=500;
		con.weekly_pay=5000;
		System.out.println(con.id);
		System.out.println(con.name);
		System.out.println(con.pay_per_hour);
		System.out.println(con.weekly_pay);
		con.displaydetails();
	}
}