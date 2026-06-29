import java.util.Scanner;

public class fibonacci{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a No.");
        int number = sc.nextInt();
        sc.close();

        int zerothFibo = 0;
        int firstFibo = 1;
        
        System.out.print(zerothFibo+" "+ firstFibo);
        int temp;
        for(int i = 3 ; i<= number; i++){

            temp  = firstFibo +zerothFibo;
            zerothFibo = firstFibo;
            firstFibo = temp;
            
            System.out.println(temp);
        }


    }
}