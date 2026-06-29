package Mathematics;
import java.util.Scanner;

class Fibon
{
	public static void main(String args[])  
		{    
			Fibonacci obj = new Fibonacci();
			System.out.println("Enter a No. for FiboNacci Series.");
			Scanner Sc = new Scanner (System.in);

			int N = Sc.nextInt();

			obj.Fibonacci.printFibonacci(N-2);
			
			Sc.close();	
			
		}
}