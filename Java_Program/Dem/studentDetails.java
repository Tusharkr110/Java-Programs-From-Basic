package Dem;
import Patterns.*;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class studentDetails {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String name = getInput(scan, "Enter Your Name");
            int age = getIntInput(scan, "Enter Your Age");

            Random random = new Random();
            boolean forSale = random.nextBoolean();
            float sgpa = random.nextInt(1, 10);
            scan.nextLine();

            String food = getInput(scan, "\nEnter Your favourite food");

            String email = getInput(scan, "\nEnter Your Email Address");
            
            String car = getInput(scan, "\nEnter Your Favourite Car Name");
            String color = getInput(scan, "\nEnter Your Favourite Car Colour");
            char grade = getCharInput(scan, "\nEnter Your Class Grade");
            char currency = '$';
            int price = random.nextInt(15000, 25000);

            displayStudentInfo(name, age, email, sgpa, grade, food, car, color, currency, price, forSale);

            System.out.println("The Program comes to an END......");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!! Please Enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");
        } catch (NoSuchElementException e) {
            System.out.println("Exception Occurred");
        }
    }

    private static String getInput(Scanner scan, String prompt) {
        System.out.println(prompt);
        return scan.nextLine();
    }

    private static int getIntInput(Scanner scan, String prompt) {
        System.out.println(prompt);
        while (!scan.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scan.next();
        }
        return scan.nextInt();
    }

    private static char getCharInput(Scanner scan, String prompt) {
        System.out.println(prompt);
        return scan.next().charAt(0);
    }

    private static void displayStudentInfo(String name, int age, String email, float sgpa, char grade, String food, String car, String color, char currency, int price, boolean forSale) {
        System.out.println("Hello " + name);
        System.out.println("You are a Student");
        System.out.println("You are " + age + " Year Old");
        System.out.println("Your email Id is: " + email);
        System.out.println("Your SGPA is: " + sgpa);
        System.out.println("Your Highest Grade in School is " + grade);
        System.out.println("Your Favourite Food is " + food);
        System.out.println("Your Dream Car is " + car + " in " + color + " color");
        System.out.println("The Price of your Dream Car is " + currency + "" + price);
        if (forSale) {
            System.out.println("The " + car + " is for Sale");
        } else {
            System.out.println("The " + car + " is Not for Sale");
        }
    }
}