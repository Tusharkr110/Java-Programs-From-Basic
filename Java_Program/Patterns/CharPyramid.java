package Patterns;
public class CharPyramid {
    public static void charPyramid(int num){
        char alpha = 'A';
        for (int i = 1; i<=num; i++)
            {
                for (int j = 1; j<=(i); j++)
                {
                    if(alpha>'Z')
                    {
                        alpha = 'A';
                    }
                    System.out.print(alpha+" ");
                    alpha++;
                }
                System.out.println();
            }
        }
}
