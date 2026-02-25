package Day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int n = sc.nextInt();
            System.out.print("Enter operation: ");
            String m = sc.next();
            System.out.print("Enter the second number:");
            int k = sc.nextInt();
            System.out.print("Result ");
            calculator(n, m, k);
        } catch (InputMismatchException e){
            System.out.print("Invalid input");
        }  catch (Exception ex) {
            System.out.print(ex.getMessage());
        }


    }
    public static void calculator(int number, String operation, int number2){

        switch (operation) {
            case "+":
                System.out.println("Addition: "+(number + number2));
                break;
            case "-":
                System.out.println("Substraction: " + (number - number2));
                break;
            case  "*":
                System.out.println("Multiplication: "+(number * number2));
                break;
            case  "/":
                if(number2 == 0) {System.out.println("Cannot divide by zero");
                }
                else{
                    System.out.println("Division: "+(number / number2));
                }
                break;
            case "%":
                if(number == 0) {System.out.println("Cannot divide by zero");
                }else{
                    System.out.println("Remainder: "+(number % number2));
                }
            default:
                System.out.println("Invalid operation: " + operation);
        }
    }
}
