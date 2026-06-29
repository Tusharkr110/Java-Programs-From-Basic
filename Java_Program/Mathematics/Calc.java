package Mathematics;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

class Calc 
{
    static int Operation(int a, char ch, int b)
    {
        switch(ch)
        {
            case '+' : System.out.print(a+b);
                        break;
            case '-' : System.out.print(a-b);
                        break;
            case '*' : System.out.print(a*b);
                        break;
            case '/' : System.out.print((float)(a/b));
                        break;
            case '%' : System.out.print(a%b);
                        break;
            default  : System.out.print("Enter a valid operater to perform operation");
        }
        System.out.print("\nOperation ends") ;
        return 1;      
    }
    public static void main(String args[])
    {
        try
        {
            Scanner scan = new Scanner (System.in);
            System.out.println("\n************************************************\n");
            System.out.println("A Simple Calculator to perform +,-,*,/,%");
            System.out.println("Hit Enter to show result");
            System.out.println("\n************************************************");
            System.out.println("Enter a No.");
            int a = scan.nextInt();
            System.out.println("Enter operater to perform operation");
            char c= scan.next().charAt(0);
            System.out.println("Enter 2nd No. ");
            int b = scan.nextInt();
            int result =Operation(a,c,b);
            System.out.println("\n"+result);
            scan.close();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input!! Please Enter a No. ");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Occured");
        }
         catch (NoSuchElementException e)
        {
            System.out.println("Exception Occured");
        }

    }
}