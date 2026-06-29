package Patterns;
public class StarPattern {
   public static void starPattern(int num){
        for (int i = 1; i<=num; i++)
            {
                for (int j = 1; j<=(i); j++)
                {
                    System.out.print("x ");
                }
                System.out.println();
            }
        }
}
