import java.util.Scanner;

/**
 * Question 4: Fibonacci Series Program
 * WAP to print the Fibonacci series up to n terms
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== FIBONACCI SERIES GENERATOR ===");
        System.out.println("Fibonacci Series: Each number is sum of two preceding ones");
        System.out.println("Series starts: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...");
        System.out.println("===================================\n");
        
        char choice;
        do {
            System.out.print("Enter the number of terms in Fibonacci series: ");
            int n = scanner.nextInt();
            
            if(n <= 0) {
                System.out.println("Error: Please enter a positive number!");
            } else if(n == 1) {
                System.out.println("Fibonacci series with 1 term: 0");
            } else if(n == 2) {
                System.out.println("Fibonacci series with 2 terms: 0, 1");
            } else {
                System.out.println("\nFibonacci series with " + n + " terms:");
                
                // Initialize first two terms
                int first = 0, second = 1;
                
                // Print first two terms
                System.out.print(first + ", " + second);
                
                // Generate and print remaining terms
                for(int i = 3; i <= n; i++) {
                    int next = first + second;
                    System.out.print(", " + next);
                    
                    // Update for next iteration
                    first = second;
                    second = next;
                }
                System.out.println(); // New line after series
                
                // Show detailed calculation for educational purpose
                if(n <= 10) {
                    System.out.println("\nDetailed calculation:");
                    first = 0;
                    second = 1;
                    System.out.println("Term 1: " + first);
                    System.out.println("Term 2: " + second);
                    
                    for(int i = 3; i <= n; i++) {
                        int next = first + second;
                        System.out.println("Term " + i + ": " + first + " + " + second + " = " + next);
                        first = second;
                        second = next;
                    }
                }
                
                // Show the golden ratio approximation for larger series
                if(n >= 5) {
                    first = 0;
                    second = 1;
                    for(int i = 3; i <= n; i++) {
                        int next = first + second;
                        first = second;
                        second = next;
                    }
                    if(first != 0) {
                        double ratio = (double)second / first;
                        System.out.printf("\nGolden Ratio approximation: %.6f\n", ratio);
                        System.out.println("(As n increases, ratio approaches φ = 1.618034...)");
                    }
                }
            }
            
            System.out.print("\nDo you want to generate another Fibonacci series? (y/n): ");
            choice = scanner.next().charAt(0);
            System.out.println();
            
        } while(choice == 'y' || choice == 'Y');
        
        System.out.println("Thank you for using Fibonacci Series Generator!");
        scanner.close();
    }
}