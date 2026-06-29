import Patterns.*;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int num;        
        boolean flag;
       try{
        do
        {
            System.out.println("1. Inverted Star Pattern.\n2. Star Pattern.\n3. Half Pyramid.\n4. Char Pyramid. \n5. Hollow Pattern. \n6. Inverted Rotated Half Pyramid.\n7. Butterfly Pattern.\n8. Butterfly Pattern2.\n9. Solid rhombus.\n10. Hollow Rhombus. \n11. Exit.");
            System.out.println("Enter Your Choice to Print Pattern");
            int choice = scan.nextInt();
            if(choice ==11 )
            {
                System.out.println("Exiting.....");
                System.exit(0);
            }
            
            System.out.println("Enter a No.");
            num = scan.nextInt();
            System.out.println("Pattern is as follows: ");
            switch (choice)
            {
                case 1: InvertedStarPattern.invertedStarPattern(num);
                break;
                case 2: StarPattern.starPattern(num);
                break;
                case 3: HalfPyramid.halfPyramid(num);
                break;
                case 4: CharPyramid.charPyramid(num);
                break;
                case 5: HollowRect.hollowRect(num);
                break;
                case 6: InvertedRotatedHalfPyramid.invertedRotatedHalfPyramid(num);
                break;
                case 7: Butterfly.butterfly(num);
                break;
                case 8: ButterflyPattern.butterflyPattern(num);
                break;
                case 9: SolidRhombus.solidRhombus(num);
                break;
                case 10: HollowRhombus.hollowRhombus(num);
                break;
                default: System.out.println("Please Enter a Valid Key!!!");
                System.exit(0);
            }  
            System.out.println("Press 'Y' to continue and 'N' to exit");
            char s= scan.next().charAt(0);   
            if( s == 'y' || s == 'Y')
            {
                flag = true;
            }
            else if(s == 'n' || s == 'N' )
            {
                flag = false;
            }
            else {
                System.out.println("Please Enter a Valid Key!!!\n Exiting.....");
                flag = false;
            }
    }while(flag);
    } 
        catch (Exception e)
        {
            System.out.println("Invalid Input!! Please Enter a No. ");
            System.exit(0);
        }
        scan.close();
    }

}