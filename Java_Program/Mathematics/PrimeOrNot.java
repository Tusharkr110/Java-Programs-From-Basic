package Mathematics;
import java.util.Scanner;
import java.util.InputMismatchException;

class PrimeOrNot
{
    void Prime(int N)
    {
        if(N>1)
            {
                int count=0;
                for (int i = 2 ; i<=(N/2) ; i++ )
                {   
                    if (N%i == 0)
                    {
                        count++;
                    } 
                }
                if(count!=0)
                {
                    System.out.println("Not a Prime No.");
                }
                else
                {
                    System.out.println("Prime No.");
                }
            }
        else
            {
                System.out.println("Please Enter a no. Greater than 1");
                System.out.println("0 and 1 are not prime no.");
            }
    }
                
    public static void main(String args [])
    {
        Scanner scan = new Scanner (System.in);
        PrimeOrNot pr = new PrimeOrNot();
        try 
        {
            System.out.println("Enter a no to check");
            int num = scan.nextInt();
            scan.close();
            pr.Prime(num);
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