package arrays;
import java.util.Scanner;
public class ArrayInput {
		
	
	Scanner sc = new Scanner(System.in);
	public static void IntegerArrayinput(int sizeOfArray,int[] arr)
	{
		
		Scanner sc = new Scanner(System.in);
		for(int i= 0; i<sizeOfArray; i++)
		{
			arr[i] = sc.nextInt();
		}
		
	}
	
	public static void StringArrayInput(String[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for(int i= 0; i<arr.length; i++)
		{
			arr[i] = sc.next();
		}
		
	}
	
	public static void printingIntegerArray(int[] arr)
	{
		System.out.print("[ ");
		for(int i= 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print(" ]");
	}
	
	public static void printingStringArray(String[] arr)
	{
		System.out.print("[ ");
		for(int i= 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
	
	public static void StringlinearSearchingArray(String key, String[] arr)
	{
		int a=0;
		boolean flag= false;
		for(int i = 0 ; i< arr.length; i++)
		{
			if (key.equals(arr[i]))
			{
				a= i;
				flag = true;
			}
		
		}
		if(flag)
		{
			System.out.println("Key found at index no. "+a);
		}
		else
		{
			System.out.println("Key NOT FOUND ");
		}
		
	}
	
	public static void linearSearchingArray(int key, int[] arr)
	{
		int a=0;
		boolean flag= false;
		for(int i = 0 ; i< arr.length; i++)
		{
			
			if (key==(arr[i]))
			{
				a= i;
				flag = true;
			}
		
		}
		
		if(flag)
		{
			System.out.println("Key found at index no. "+a);
		}
		else
		{
			System.out.println("Key NOT FOUND ");
		}
		
		
	}

	
}
