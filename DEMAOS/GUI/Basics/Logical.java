package Basics;
import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter Temp in Degree Celcius");
		int temp = sc.nextInt();
		
		if(temp >33) System.out.println("It is Hot Outside");
		
		else if(temp >= 20 && temp <= 30) System.out.println("It is Moderate Warm");
		
		else System.out.println("It is Cold OUTSIDE");
		
		
		System.out.println("You are Playing a Game! To Quit the Game Press Q or q");
		char C = sc.next().charAt(0);
		
		if(C != 'q' && C != 'Q')
			System.out.println("Game Quittt....");
		else if(C == 'q' || C == 'Q')
			System.out.println("Game Quittt....");
		else System.out.println("You'r Still Playing GAME");
		
		
		sc.close();
	}

}
