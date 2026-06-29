package Basics;
import java.util.ArrayList;
import java.util.Scanner;

public class WrapperClass {

	public static void main(String[] args) {
	
		// Auto-boxing = The automatic conversion that Java Compiler makes between the Primitive type and their corresponding object wrapper classes.
		// Un-boxing = The Reverse of Auto-boxing. Automatic Conversion of Wrapper Class to Primitive.
		
		Boolean a = true;
		Integer c= 23;
		Character b = '#';
		Double d = 32.23;
		String s = "Tisha";
		System.out.println(a+" "+ b+" "+ c +" "+ d +" "+ s);
		
				//ArrayList
		
		Scanner sc = new Scanner(System.in);
		int n = 4;
		
		ArrayList<String> food = new ArrayList<String>();
		
		ArrayList<Integer> Marks = new ArrayList<Integer>();
		
		ArrayList<Double> Height = new ArrayList<Double>();
		
		System.out.println("Enter 4 Food Names");
		
		for(int i= 1 ; i<=n ; i++)
		{
			food.add(sc.next());
		}
		
		food.add("PiZZA");
		food.add("Burger");
		food.add("Nuggets");
		
		System.out.println("\n");
		System.out.println(food);
		
//		for(int i= 0 ; i< food.size(); i++ )		{
			System.out.println("\n");
//		}
		
		Marks.add(43);
		Marks.add(23);
		Marks.add(68);
		Marks.set(2,2323);
		Marks.remove(1);
		
		
//		//using ForEach Loop
		for(int marks : Marks)
		{
			System.out.println(marks);
		}
		
		
		// Using for loop
//		for(int i= 0 ; i< Marks.size(); i++ )
//		{
//			System.out.println(Marks.get(i)+" index = "+i);
//		}
		
			System.out.println("Enter Height of 4 Students: ");
		for(int i= 0 ; i<n; i++ )
		{
			Height.add(sc.nextDouble());
		}
			for(int i= 0 ; i< Height.size(); i++ )
		{
			System.out.printf("%.3f feet%n",(Height.get(i)/30.48));
		}
	
		
		
		//2-d ArrayList
			

		
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("Pasta");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Donuts");
		
		ArrayList<String> productList = new ArrayList<String>();
		productList.add("Tomatoes");
		productList.add("Zuccihini");
		productList.add("Peppers");
		
		ArrayList<String > drinkList = new ArrayList<String>();
		drinkList.add("Soda");
		drinkList.add("Coke");
		
		ArrayList<ArrayList<String>>groceryList = new ArrayList<ArrayList<String>>();
		groceryList.add(bakeryList);
		groceryList.add(productList);
		groceryList.add(drinkList);
		groceryList.add(food);
		System.out.println(groceryList.get(2).get(1));
		sc.close();
		
}
}