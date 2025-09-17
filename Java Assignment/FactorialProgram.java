import java.util.Scanner;

/**
 * Question 3: Factorial Program
 * WAP to find factorial of a number using for loop
 */
public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== FACTORIAL CALCULATOR ===");
        System.out.println("This program calculates factorial of a number using for loop");
        System.out.println("Factorial of n = n × (n-1) × (n-2) × ... × 2 × 1");
        System.out.println("=============================\n");
        
        char choice;
        do {
            System.out.print("Enter a positive integer to find its factorial: ");
            int number = scanner.nextInt();
            
            if(number < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers!");
            } else if(number == 0 || number == 1) {
                System.out.println("Factorial of " + number + " = 1");
                System.out.println("(By definition: 0! = 1! = 1)");
            } else {
                // Calculate factorial using for loop
                long factorial = 1;
                
                System.out.print("\nCalculation: " + number + "! = ");
                for(int i = number; i >= 1; i--) {
                    factorial *= i;
                    System.out.print(i);
                    if(i > 1) {
                        System.out.print(" × ");
                    }
                }
                
                System.out.println(" = " + factorial);
                System.out.println("Factorial of " + number + " = " + factorial);
                
                // Additional info about the result
                if(factorial > 1000000) {
                    System.out.println("Note: This is a very large number!");
                }
            }
            
            // Show step-by-step calculation for educational purpose
            if(number > 1 && number <= 10) {
                System.out.println("\nStep-by-step calculation:");
                long stepResult = 1;
                for(int i = 1; i <= number; i++) {
                    stepResult *= i;
                    System.out.println("Step " + i + ": " + stepResult + " (multiplied by " + i + ")");
                }
            }
            
            System.out.print("\nDo you want to calculate another factorial? (y/n): ");
            choice = scanner.next().charAt(0);
            System.out.println();
            
        } while(choice == 'y' || choice == 'Y');
        
        System.out.println("Thank you for using Factorial Calculator!");
        scanner.close();
    }
}