package oops;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

		String name = "Gold"; 
		ObjectAsArgument obj = new ObjectAsArgument(name);
		
		Meth meth = new Meth();
		meth.team(obj);
		System.out.println("Enter a No.");
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println("Enter a Degree/power of the No.");
		int y = sc.nextInt();
		Main main = new Main();
		System.out.println(main.pow(n,y));
		sc.close();
		
	}
	
	 int pow (int x, int y)
	{
		int result = 1 ;
		if(y!=0)
		{
			for(int i = 0; i< y; i++)
			{
				result =result *x;
				
			}
		}
		else
		{
			result =1;
		}
		return result;
	}
}