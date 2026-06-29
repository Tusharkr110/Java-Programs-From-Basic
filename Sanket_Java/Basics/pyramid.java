import java.util.Scanner;

public class pyramid{
    public static void main (String args[])
    {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a NO.");
        int rows = sc.nextInt();

        // initials

        int spaces = rows-1;
        int stars = 1;

        // For Workspace
        for(int i =1; i<= rows; i++)
        {

            // For spaces
            for (int j= 1; j<= spaces; j++)
            {
                System.out.print(" ");
            }

            // For Stars
            for (int k = 1; k<=stars; k++){
                System.out.print("*");
            }

            System.out.println("");
            stars +=2;
            spaces--;
        }
    }
}