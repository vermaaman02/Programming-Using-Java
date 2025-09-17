import java.util.Scanner;

/**
 * Simple Calculator Program
 * College Assignment: Java Calculator with Switch Case
 * 
 * This program takes two numbers and an operator as input
 * and performs the calculation using switch case statement.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        System.out.println("=== JAVA CALCULATOR ===");
        System.out.println("A Simple Calculator Program");
        System.out.println("Supports: +, -, *, /");
        System.out.println("========================\n");
        
        do {
            try {
                // Input first number
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                
                // Input operator
                System.out.print("Enter operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);
                
                // Input second number
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                double result;
                boolean validOperation = true;
                
                // Switch case for operations
                switch(operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                        break;
                        
                    case '-':
                        result = num1 - num2;
                        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                        break;
                        
                    case '*':
                        result = num1 * num2;
                        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                        break;
                        
                    case '/':
                        if(num2 != 0) {
                            result = num1 / num2;
                            System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed!");
                            validOperation = false;
                        }
                        break;
                        
                    default:
                        System.out.println("Error: Invalid operator! Please use +, -, *, or /");
                        validOperation = false;
                        break;
                }
                
                if(validOperation) {
                    System.out.println("Operation completed successfully!");
                }
                
            } catch(Exception e) {
                System.out.println("Error: Invalid input! Please enter valid numbers.");
                scanner.nextLine(); // Clear the invalid input
            }
            
            // Ask if user wants to continue
            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);
            System.out.println(); // Add a blank line for better formatting
            
        } while(choice == 'y' || choice == 'Y');
        
        System.out.println("Thank you for using Java Calculator!");
        System.out.println("Program terminated.");
        scanner.close();
    }
}