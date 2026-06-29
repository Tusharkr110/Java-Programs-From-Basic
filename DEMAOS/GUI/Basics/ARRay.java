package Basics;
import java.util.Scanner;
public class ARRay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String[] cars = { "Camero", "Corvett", "Tesla", "GT","WagonR"};
		
		cars[0]  ="Mustang";
		
		for (String car : cars)
			System.out.print(car+" ");
		
		System.out.println("\n");
		
		String[][] bikes = new String[3][3];
		
		
		System.out.println("Enter The Bike Name");
		
		for(int i = 0; i<bikes.length; i++)
			for(int j=0; j<bikes.length; j++)
				bikes[i][j]= sc.next();
		
		
		for(int i = 0; i<bikes.length; i++)
		{
			System.out.println("\n");
			for(int j=0; j<bikes.length; j++)
				System.out.printf(bikes[i][j] +" ");
		}
			
		
//		for (String bike[] : bikes)
//			for(String Bike : bike)
//				System.out.print(Bike+"\n");
		sc.close();
		}

	}

