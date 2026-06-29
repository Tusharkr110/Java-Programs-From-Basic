package Basics;

import java.util.Scanner;

public class hello{

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a No.");
        int a = sc.nextInt();

        System.out.println("The No is "+ a);
        

        System.out.printf("Hello %s##!@%n", "World");
        System.out.printf("This is %s.Tushar Kumar and his Rank is %d.%n","Mr", 12);

        long b = 234_000_999l;
        System.out.println("variable value"+b);

        boolean primeSubscriber= false;
        if(primeSubscriber == true)
        {
            System.out.println("Some Screen");
        }
        else{
            System.out.println("Some Other Screen");
        }
      
        
    }
}