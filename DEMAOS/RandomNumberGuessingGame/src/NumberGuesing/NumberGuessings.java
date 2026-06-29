package NumberGuesing;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessings {

	public static void main(String args[])
	{
		Random rand = new Random();
		int x = rand.nextInt(100);
		int count=0;
		String c ="n";
		boolean flag = true;
		Scanner sc = new Scanner (System.in);
		try {
		while(flag)
		{
			
			System.out.println("Enter a No. Between 1 to 100");
			int y = sc.nextInt();
			
			if(y==x)
			{
				System.out.println("Yoooo hoooo You Guessed it in "+ ++count + " No. of Chances.");
				flag = false;
			}
			else if (y < x )
			{
				System.out.println("The Entered No. is too Small");
				flag = true;
				count++;
			}
			else if (y  > x)
			{
				System.out.println("The Entered No. is too large");
				flag = true;
				count++;
			}
			else 
			{
				System.out.println("Invalid No. Entered");
			}
			
			if(count >=5) 
			{
				System.out.println("Press 'y' or 'Y' to show the no.");
				c = sc.next();
				if(c == "y" || c == "Y")
				{
					System.out.println("The No. to be chosen was "+ x);
					flag = false;
				}
			}
		}}catch (Exception e)
		{
			System.out.println("The Entered No. is invalid");
		}
		
		finally {
			sc.close();
		}
		
	}
}
