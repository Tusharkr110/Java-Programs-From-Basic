package patterns;
// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.Collections;
public class MAIN
{
	public static void main (String[] args)
	{		
		// Scanner Scanner = new Scanner (System.in);
		String name = "Tusjar";
		name = name.replace('j', 'h');
		String name2 = new String ("aman");
		System.out.println(name);
		System.out.println(name2);
		int a = 23;
		String nae = "Tushar";
		String nam2 = new String ("TuShar Kumar!");
		String words[] =nam2.split(", ");
		for (String row : words) {
			System.out.println(row);
		}
		
		char Aa[] = new char[26];
		char z = 'a';
		for (int i = 0 ; i< Aa.length; i++)
		{	 
			Aa[i] = z;
			z++;
		}
		for( char abz : Aa )
		{
			System.out.print(abz+" ");
		}
		// float b = a + 45;
		// System.out.println(b);// implicit 
		// float x = 32.43f;
		// int y = 34;
		// int z = (int)(x + y);// explicit casting
		// System.out.println(z);
		// int Marks[] = new int[5];
		// for( int i =0 ; i< Marks.length; i++)
		// Marks[i] = Scanner.nextInt();
		// Marks[0] = 323;
		// Marks[3] =23;
		// System.out.println(Marks[0] + " " + Marks[3]);
		// Arrays.sort(Marks);
		// for( int i=Marks.length-1;i>=0; i--)
		// System.out.print(Marks[i]+" ");

	}
}