package Mathematics;
import java.util.Scanner;
class ConvertNum
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Binary No.");
        int num = scan.nextInt();
        binToDeci(num);
        System.out.println("Enter a Decimal No.");
        int num2 = scan.nextInt();
        deciToBinary(num2);
        scan.close();
    }
private static int deciToBinary(int num) {
    int temp = num;
    int bin = 0, rem= 0, count=0;
    while (temp != 0)
    {
        rem = (temp % 2);
        bin += (rem * Math.pow(10,count));
        count++;
        temp /=2;
    }
        System.out.println(num + " in Decimal is: "+ bin);
        return 0;
}
private static int binToDeci(int num) {
    int temp = num;
    int deci =0, rem= 0, count = 0;
    while (temp != 0)
    {
        rem = (temp % 10);
        deci += rem*Math.pow(2,count);
        count++;
        temp /= 10;
    }
    System.out.println(num + " in Decimal is: "+ deci);
    return 0;
}
}
