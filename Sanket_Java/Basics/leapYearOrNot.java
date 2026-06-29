import java.util.Scanner;
public class leapYearOrNot{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args [])
    {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a Year.");

        int Year = sc.nextInt();
        sc.close();
        int count=0;
        int temp = Year;
        while(temp>0){
            
            temp = temp/10;
            count++;
        }

        if (count == 4){

            if ((Year %4 == 0 && Year % 100 !=0) || Year %400 ==0 ){
                System.out.println("It is a Leap Year.");
            }
            else{
                System.out.println("It is NOT a Leap Year");
            }
        }
        else{
            System.err.println("Please Enter a valid Year.");
        }
    }
}