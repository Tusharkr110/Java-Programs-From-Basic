
import java.util.Scanner;

public class PrimeOrNot{
    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        System.out.println("Enter a No.");

        int firstNumber = scans.nextInt();

        boolean flag = true;
          

            if(firstNumber==2 || firstNumber ==3)
            {
                flag=true;
            }

            else{

                for(int i=2; i<= (firstNumber -1) ;i++)
                {
                    if(firstNumber%i == 0)
                    {
                        flag = false;
                        break;
                    }
                    // else
                    // {
                    //     flag = true;
                    // }
                }
            }

        if(flag== true){
            System.out.println("It is a Prime No");
        }
        else{
            System.out.println("It is not a Prime No.");
        }
    }
}