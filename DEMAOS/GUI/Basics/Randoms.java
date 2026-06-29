package Basics;
import java.util.Random;
import java.util.Scanner;
public class Randoms {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		float x = rand.nextFloat(10);
		System.out.println(x);
		String day = sc.next();
		
		switch (day)
		{
			case "Monday" : System.out.println("It is Monday");
			break;
			case "Tuesday": System.out.println("It is Tuesday");
			break;
			case "Wednesday": System.out.println("It is Wednesday");
			break;
			case "Thursday": System.out.println("It is Thursday");
			break;
			case "Friday": System.out.println("It is Friday");
			break;
			case "Saturday": System.out.println("It is Saturday");
			break;
			case "Sunday": System.out.println("It is Sunday");
			break;
			default : System.out.println("Not a valid day");
			sc.close();
		}
	}

}
