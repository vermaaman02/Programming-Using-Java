import java.util.Scanner;

/**
 * Question 1: Simple Calculator Program
 * Create a simple calculator program that takes two numbers and an operator (+, -, *, /)
 * as input and performs the calculation using a switch case statement (Scientific calculator if wanted)
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        System.out.println("=== SIMPLE CALCULATOR ===");
        System.out.println("Basic Operations: +, -, *, /");
        System.out.println("Scientific Operations: s(sin), c(cos), t(tan), q(sqrt), p(power)");
        System.out.println("==========================\n");
        
        do {
            try {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Enter operator (+, -, *, /, s, c, t, q, p): ");
                char operator = scanner.next().charAt(0);
                
                double num2 = 0;
                if (operator != 's' && operator != 'c' && operator != 't' && operator != 'q') {
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                }
                
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
                            System.out.println("Error: Division by zero!");
                            validOperation = false;
                        }
                        break;
                        
                    // Scientific calculator functions
                    case 's':
                        result = Math.sin(Math.toRadians(num1));
                        System.out.printf("sin(%.2f°) = %.4f\n", num1, result);
                        break;
                        
                    case 'c':
                        result = Math.cos(Math.toRadians(num1));
                        System.out.printf("cos(%.2f°) = %.4f\n", num1, result);
                        break;
                        
                    case 't':
                        result = Math.tan(Math.toRadians(num1));
                        System.out.printf("tan(%.2f°) = %.4f\n", num1, result);
                        break;
                        
                    case 'q':
                        if(num1 >= 0) {
                            result = Math.sqrt(num1);
                            System.out.printf("√%.2f = %.4f\n", num1, result);
                        } else {
                            System.out.println("Error: Cannot find square root of negative number!");
                            validOperation = false;
                        }
                        break;
                        
                    case 'p':
                        result = Math.pow(num1, num2);
                        System.out.printf("%.2f ^ %.2f = %.4f\n", num1, num2, result);
                        break;
                        
                    default:
                        System.out.println("Error: Invalid operator!");
                        validOperation = false;
                        break;
                }
                
                if(validOperation) {
                    System.out.println("Operation completed successfully!");
                }
                
            } catch(Exception e) {
                System.out.println("Error: Invalid input! Please enter valid numbers.");
                scanner.nextLine(); // Clear invalid input
            }
            
            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);
            System.out.println();
            
        } while(choice == 'y' || choice == 'Y');
        
        System.out.println("Thank you for using Simple Calculator!");
        scanner.close();
    }
}