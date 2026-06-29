package Patterns;
public class HollowRect {
    public static void hollowRect(int num){
        for (int i = 1 ; i < num ; i++)
               {
                for (int j = 1; j<=num; j++)
                {
                    if (i == 1 || i == (num-1) || j== num || j== 1)
                    {
                        System.out.print("* ");
                    }
    
                    else
                    {
                        System.out.print("  ");
                    }
                }System.out.println();
            }
        }
}
