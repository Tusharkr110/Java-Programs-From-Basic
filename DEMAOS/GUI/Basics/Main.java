package Basics;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Small Project to find Hypoteneous of a Triangle");
		Scanner sc = new Scanner(System.in);
		double h, b;
		System.out.println("Enter Height of the Triangle (in M)");
		h = sc.nextDouble();
		System.out.println("Enter Base of the Triangle (in M)");
		b = sc.nextDouble(); 
//		double sum = Math.pow(h, 2)+Math.pow(b, 2);
		double H = Math.sqrt(Math.pow(h, 2)+Math.pow(b, 2));
		System.out.println("The Hypoteneous of the given triangle base and height is "+H);
		
			
//		System.out.println("Enter a No. ");
//		int x = sc.nextInt();
//		System.out.println(x);
		sc.close();
	}

}
