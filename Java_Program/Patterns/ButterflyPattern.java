package Patterns;
public class ButterflyPattern {
    //2nd  Method
    public static void butterflyPattern(int num)
    {
        // First Half Pattern
        for (int i = 1; i<=num; i++)
        {
            // Star Pattern 1st
            for(int j=1; j <=i; j++)
            {
                System.out.print("x ");
            }
            // Spaces Between Stars
            for(int j= 1; j<=2*(num-i); j++)
            {
                System.out.print("  ");
            }
            // Star Pattern 2nd
            for(int j=1; j <=i; j++)
            {
                System.out.print("x ");
            }
            System.out.println();
        }
        //2nd Half Pattern
        for (int i = num; i>=1; i--)
        {
            // Star Pattern 1st
            for(int j=1; j <=i; j++)
            {
                System.out.print("x ");
            }
            // Spaces Between Stars
            for(int j= 1; j<=2*(num-i); j++)
            {
                System.out.print("  ");
            }
            // Star Pattern 2nd
            for(int j=1; j<=i; j++)
            {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
