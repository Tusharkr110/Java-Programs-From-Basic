package Patterns;
public class SolidRhombus {
    public static void solidRhombus(int num)
        {
            for(int i = 1 ; i<=num; i++)
            {
                for (int j= num; j>=i ; j-- )
                {
                    System.out.print("  ");
                }
                for (int j= 1; j<= num ; j++ )
                {
                    System.out.print("X ");
                }
                System.out.println();
            }   
        }
    }
