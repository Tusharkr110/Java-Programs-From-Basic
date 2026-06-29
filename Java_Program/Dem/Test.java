import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Test
{
    public static void main (String args [])
    {
        try(Scanner scan = new Scanner (System.in))
        { 
            
            displayMadGameIntro();

            String adjectives1 =  getInput(scan, "Enter an Adjective (Description):");

            String nouns1 = getInput(scan, "\nEnter a Noun (animal or person or place):");

            String adjectives2 = getInput(scan, "\nEnter an Adjective (Description):");

            String verbs1 = getInput(scan, "\nEnter an verb end with -ing (action):");

            String adjectives3 = getInput(scan, "\nEnter an Adjective (Description):");

            MadLabGame obj = new MadLabGame();
	
            obj.MadGame(adjectives1, nouns1, adjectives2, verbs1, adjectives3);
            
                        System.out.println("The Program comes to an END......\n\n");
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
            
private static void MadGame(String adjectives1, String nouns1, String adjectives2, String verbs1,String adjectives3) 
{
    throw new UnsupportedOperationException("Unimplemented method 'MadGame'");
}
            
private static String getInput(Scanner scan, String prompt)
{
    System.out.println(prompt);
    return scan.nextLine();
}

private static void displayMadGameIntro()
{
    System.out.println("\n************************************************\n");
    String s= "READY TO PLAY 'MAD GAME'!!!";
    System.out.format("%37s%n",s);
    System.out.println("\n************************************************");
}
public static class MadLabGame
{
    static void MadGame(String adjectives1,String nouns1,String adjectives2,String verbs1,String adjectives3)
    {

        System.out.println("\n************************************************");
        System.out.println("\nToday I went to a "+adjectives1+" zoo.");
        System.out.println("In an exhibit, I saw a "+ nouns1+ ".");
        System.out.println(nouns1 + " was "+ adjectives2 + " and "+ verbs1 +"!");
        System.out.println("I was "+adjectives3+ "!");
        System.out.println("\n************************************************\n");

    }
}}