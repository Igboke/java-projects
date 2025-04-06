package main.java.com.igbokedaniel.cliCalculator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 =0.0;
        double num2=0.0;
        char operator=' ';
        double result=0;
        boolean endProgram = false;
        boolean validInput;

        while (!endProgram) {
            validInput = false;
            while (!validInput) {
                System.out.print("Enter Number: ");
                try {
                    num1 = scanner.nextDouble();
                    validInput = true;   
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Enter a valid Integer");
                    scanner.next();
                }
            }
            
            System.out.print("Enter Operator *, +, -, /, ^, Q to quit: ");
            operator = scanner.next().charAt(0);
            
            if (operator == 'q' || operator == 'Q'){
                endProgram = true;
                continue;
            }
            
            validInput = false;
            while (!validInput) {
                System.out.print("Enter Number: ");
                try {
                    num2 = scanner.nextDouble();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Enter a valid Integer");
                    scanner.next();
                }
            }
            
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1*num2; break;
                case '/': {
                    if(num2 == 0){
                        System.out.println("Cannot Divide by 0");
                        continue;
                    }
                    result = num1/num2; 
                    break;}
                case '^': result = Math.pow(num1, num2); break;
                default:
                    System.out.println("Invalid Operator");
                    continue;
            }
            System.out.printf("The result of %.1f %c %.1f is %.1f\n",num1,operator,num2,result);
    }
        scanner.close();    
        
    }
}