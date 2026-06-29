package Basics;

public class Method {
	
	//Default Constructor
	Method()
	{

		System.out.println("My Name is Kr");
		
	}
	
	//Parameterized Constructor
	Method(String Name)
	{
		this();
		System.out.println("My Name is Kr"+Name);
		
	} 

	//Main method
	public static void main(String[] args) {
		
		String name ="Tushars";// Instance Variable
		Method obj = new Method(name);//Object Creation of a method of class Name "Method"
		obj.greet(name);
		int x=10;
		int y =23;
		int z =1200;
		System.out.println("The sum of "+x+", "+y+" and "+z +" is = "+sum(x,y,z));
		System.out.println("The sum of "+x+" and "+y +" is = "+sum(x,y));
	}
	
	String name= "Ashu";  // Local Variable
	void greet(String name)
	{
		
		System.out.println("Hellos "+name);
		System.out.println("Hello "+this.name);
		
	}
	
	static int sum (int a , int b)
	{
		return a+b;
	}
	
	// Method Overloading
	static int sum (int a , int b , int c)
	{
		return a+b+c;
	}
}
