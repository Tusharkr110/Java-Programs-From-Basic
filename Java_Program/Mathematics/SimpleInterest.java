package Mathematics;
import java.util.Scanner;
import java.util.InputMismatchException;
class SimpleInterest
{
    float si(int principle, float rate, int time)
        {
            return (principle*rate*time);
        }

public static void main(String args[])
{
    Scanner scan = new Scanner (System.in);
    SimpleInterest simple = new SimpleInterest();
    try 
    {
        System.out.println("Enter the Principle Amount ");
        int principleAmount ;
        principleAmount = scan.nextInt();

        System.out.println("Enter the Rate of interest");
        float rateOfInterest ;
        rateOfInterest = scan.nextFloat();

        System.out.println("Enter the Time period for the Amount ");
        int timePeriod ;
        timePeriod = scan.nextInt();
        scan.close();
        float result = simple.si(principleAmount, rateOfInterest, timePeriod);

        System.out.println("The Simple Interst of the Principle Amount "+ principleAmount+" for the time period "+ timePeriod +" with the rate of Interest "+rateOfInterest +" is : "+ result);
    }
    catch (ArithmeticException e)
    {
        System.out.println("Arithmetic Operation Exception ");
    }
    catch(InputMismatchException e)
    {
        System.out.println("Please Enter an Integer Value");
    }
    
}
}