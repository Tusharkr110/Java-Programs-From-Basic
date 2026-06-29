package oops;

//WashingMachine washingMachine = new WashingMachine();
//washingMachine.running();
//System.out.println(washingMachine.toString());


public class WashingMachine {

	String model;
	int year ;
	String make;
		
	public String toString()
	{
		return "toString method Explicit"+this.make+"\n"+ this.model +"\n"+ this.year;
	}
	
	WashingMachine()
	{
		
		model="Old Money";
		year = 2010;
		make = "Samsung";
			
		System.out.println(model +"\n"+ year+ " \n"+ make);
	}
	void running()
	{
		System.out.println("The Washing Machine is Working");
	}
}
