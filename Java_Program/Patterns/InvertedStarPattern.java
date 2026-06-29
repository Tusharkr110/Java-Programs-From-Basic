package Patterns;
public class InvertedStarPattern {
    public static void invertedStarPattern(int num){
        for (int i = 1; i<=num; i++)
            {
                for (int j = 1; j<=(num-i+1); j++)
                {
                    System.out.print("x ");
                }
                System.out.println();
            }
        }
}
