package oops;

//printing Statements for Main file

//CONSTRUCTOR IS AN SPECIAL METHOD THAT IS CALLED WHEN AN OBJECT IS INSTANTIATED(CREATED)

//Car myCar = new Car("Mahindra","Thar",2020,"Black",2200000);
//Car myCar3 = new Car();
//Car myCar2 = new Car("BenzMercedez","XLR",2010,"White",5000000);
//
//System.out.println(myCar.toString());
//myCar3.setMake("BMW");
//myCar3.setColor("Meganta");
//myCar3.setModel("8R");
//myCar3.setPrice(2500000);
//myCar3.setYear(2000);
//
//System.out.println("CAR 1");
//System.out.println(	"\nMaufacturer  "+myCar.getMake()
//+"\nModel "+myCar.getModel()
//+"\nYear "+myCar.getYear()
//+"\nColor "+myCar.getColor()
//+"\nPrice "+myCar.getPrice());
//
//System.out.println("\nCAR 2");
//System.out.println(	"\nMaufacturer  "+myCar2.getMake()
//+"\nModel "+myCar2.getModel()
//+"\nYear "+myCar2.getYear()
//+"\nColor "+myCar2.getColor()
//+"\nPrice "+myCar2.getPrice());
//
//System.out.println("\nCAR 3");
//System.out.println(	"\nMaufacturer  "+myCar3.getMake()
//+"\nModel "+myCar3.getModel()
//+"\nYear "+myCar3.getYear()
//+"\nColor "+myCar3.getColor()
//+"\nPrice "+myCar3.getPrice());
//
//
//myCar2.drive();
//myCar.brake();
//
//

public class Car {

	
	Car()
	{
//		sub();
		System.out.println("This is a Default Constructor\n");
	}
	
	Car(String make, String model, int year, String color, double price ) //all are local variable
	{
		
		this.setMake(make) ;
		this.setModel(model);
		this.setYear(year);
		this.setColor(color);
		this.setPrice(price);
	}
	
	//all are instance variable
	private String make ;
	private String model;
	private int year ;
	private String color;
	private double price;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	void drive()
	{
		System.out.println(this.model+" drive");
	}
	
	void brake()
	{
		System.out.println(this.model+" applied brake");
	}

}
