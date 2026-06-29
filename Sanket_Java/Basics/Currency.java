import java.text.*;
import java.util.*;

class Currency {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        // US
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // India (custom Locale)
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        // China
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // France
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}