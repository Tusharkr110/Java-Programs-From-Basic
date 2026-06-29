

package Patterns;
public class Butterfly {
    public static void butterfly(int num)
{ 
    // First Half Pattern Butterfly
    for(int i = 1; i<=num; i++)
    {
        // First Triangle Pattern
        for (int j = 1; j<=num; j++)
        {
            if (j<=i) {
                System.out.print("x ");
            }
            else {
                System.out.print("  ");
            }
           
        }
        // Second Triangle Pattern
        for (int j = 1; j<=num; j++)
            {
                if(j<=(num-i))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
        // Second Half Pattern Butterfly
        for (int i = 1; i<=num; i++)
        {
            // First Triangle Pattern
            for (int j = 1; j<=num; j++)
            {
                if(j<=num-i+1){
                    System.out.print("x ");
                }   
                else {
                    System.out.print("  ");
                }       
            }
            // Second Triangle Pattern
            for(int j= 1; j<=num ; j++)
            {
                if(j<i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
        
    }

}
