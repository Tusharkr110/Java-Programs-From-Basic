package Patterns;
public class InvertedRotatedHalfPyramid
{
    public static void invertedRotatedHalfPyramid(int num)
    {
        for(int i = 1; i<= num; i++)
        {
            for ( int j =1; j<=num; j++)
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
    }
}
