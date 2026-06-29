import java.util.Scanner;
public class SumOfNumbers{

@SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner scana = new Scanner(System.in);
        System.out.println("Enter a No.");
        int firstNumber = scana.nextInt();
        scana.close();
        int sum = 0;
        for(int i = 1; i<=firstNumber; i++)
        {
            sum +=i;
        }

        System.out.println("The Sum of the " +firstNumber+" is "+sum );
    }
}