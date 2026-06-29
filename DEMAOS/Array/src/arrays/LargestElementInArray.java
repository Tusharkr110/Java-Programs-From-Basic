package arrays;
import java.util.Scanner;
public class LargestElementInArray {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		//Array Input
		for(int i=0; i<n; i++)
		{
			
			arr[i]= sc.nextInt();
			
		}
		int a = 0, b = 0;
		int large = arr[0];
		int secondLarge = arr[0];
		
		//finding/Searching largest no.
		for(int i = 0; i <arr.length; i++)
		{
			if(arr[i] >= large)
			{
				large = arr[i];
				a = i;//storing index of largest no.
			}
			
		}
		
		//searching for second largest no 
		for(int j = 0; j< arr.length ; j++)
		{
			
			if(j != a)//checking with the index no. of the largest element in array
			{
				if(arr[j] >= secondLarge)
				{
					secondLarge = arr[j];
					b = j;
				}
				

			}
			
		}
		
		
		System.out.println(large+" is the Largest No. is at index no "+a);
		System.out.println(secondLarge+" is the Second Largest No. is at index no "+b);
		sc.close();
		
	}

}
