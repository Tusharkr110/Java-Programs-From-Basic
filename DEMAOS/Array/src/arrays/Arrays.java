package arrays;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Arrays {
	
	
	public static void main(String[] args) throws IOException {
		
/* 
 * First Input Method
 * 
 * Scanner sc = new Scanner(System.in);
		sc.close();
		
*/
		
		
/* 
* Second Input Method(must include within IOException) also to import java.io.*;
* 
* 	InputStream inputStream = System.in;

	Reader inputStreamReader =new InputStreamReader(inputStream);
		
	BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
	
	String name = bufferedReader.readLine();
		double num = Double.parseDouble(name);
				
*/
		
		
/*
 * Third Input Method(must include within IOException) also to import java.io.*;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
*/
//		ArrayList<String> xyz =   new ArrayList<String>();
//		xyz.add("Tushar kumar");
//		xyz.add("Tushar");
//		xyz.add("Tushar");
//		xyz.add("Tushar");
//		xyz.set(2,"Kumar");
//		
//		System.out.println(xyz);
//		
//		for(int i = 0; i<xyz.size();i++)
//		{
//			System.out.println(xyz.get(i));
//		}
//		
//		ArrayList<Integer> abc = new ArrayList<Integer>();
//		
//		abc.add(234);
//		abc.add(4323);
//		abc.set(1,32);
//		abc.add(244);
//		System.out.println(abc);
		
		System.out.println("Enter a No.");
//		InputStream inputStream = System.in;
//		Reader inputStreamReader = new InputStreamReader(inputStream);
//		BufferedReader readers = new BufferedReader(inputStreamReader);
		BufferedReader readers = new BufferedReader(new InputStreamReader(System.in));
		

//		
//		System.out.println(nNumber);
//		
//		int marks []= new int[n];
//		System.out.println("Enter the Value for the Array");
//		for(int i = 0; i< marks.length; i++)
//		{
//			String input = readers.readLine();
//			marks[i] = Integer.parseInt(input);
//		}
//		
//		for (int a : marks)
//		{
//			System.out.print(a+" ");
//		}
//		
//		
//		String nNumber = readers.readLine();
//		int n = Integer.parseInt(nNumber);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		System.out.println("Enter the Value for the Array");

		String arr[]=new String[n];
		
		ArrayInput.StringArrayInput(arr);
//		sc.next();
		System.out.println("Enter the Key to find in array");
		String key =readers.readLine();
		
		ArrayInput.StringlinearSearchingArray(key, arr);
		sc.close();
		
		System.out.println("The Array Elements are");
		
		ArrayInput.printingStringArray(arr);
						 
	}
}

