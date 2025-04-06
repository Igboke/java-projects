package main.java.com.igbokedaniel.cliCalculator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result=0;

        
        try {
            System.out.print("Enter Number: ");
            num1 = scanner.nextDouble();
            
        } catch (Exception e) {
            System.out.println("Enter a valid Integer");
            scanner.close();
            return;
        }

        System.out.print("Enter Operator *, +, -, /, ^: ");
        operator = scanner.next().charAt(0);
        
        try {
            System.out.print("Enter Number: ");
            num2 = scanner.nextDouble();
            
        } catch (Exception e) {
            System.out.println("Enter a valid Integer");
            scanner.close();
            return;
        }
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1*num2; break;
            case '/': result = num1/num2; break;
            case '^': result = Math.pow(num1, num2); break;
            default:
                System.out.println("Invalid Operator");
        }
        scanner.close();
        System.out.printf("The result of %.1f %c %.1f is %.1f",num1,operator,num2,result);
        
    }
}