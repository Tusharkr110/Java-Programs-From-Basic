package Mathematics;
import java.util.InputMismatchException;
import java.util.*;
class NoOfPrime 
{
    static boolean IsPrime(int N)
    {
        if (N<2) return false;
        for ( int i=2;i<=Math.sqrt(N);i++)
        {
            if(N % i ==0)
            return false;            
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in );
        try 
        {
            System.out.println("Enter a No.");
            int n = scan.nextInt();
            scan.close();
            int count = 0 , num =2;
            System.out.println("First "+ n + "Prime Numbers:");
            while(count<n)
            {
                if(IsPrime(num))  //Prime No. is checking for boolean value true from the method IsPrime 
                {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input!! Please Enter a No. ");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Occured");
        }
    }
}