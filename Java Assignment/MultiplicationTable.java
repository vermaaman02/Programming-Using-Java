import java.util.Scanner;

/**
 * Question 2: Multiplication Table Program
 * WAP to take a number as input and print its multiplication table from 1 to 10
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MULTIPLICATION TABLE GENERATOR ===");
        System.out.println("This program generates multiplication table from 1 to 10");
        System.out.println("=======================================\n");
        
        char choice;
        do {
            System.out.print("Enter a number to generate its multiplication table: ");
            int number = scanner.nextInt();
            
            System.out.println("\n--- Multiplication Table of " + number + " ---");
            System.out.println("╔══════════════════════════════╗");
            System.out.printf("║   Multiplication Table of %-2d ║\n", number);
            System.out.println("╠══════════════════════════════╣");
            
            // Generate multiplication table from 1 to 10
            for(int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.printf("║  %2d × %2d = %-15d ║\n", number, i, result);
            }
            
            System.out.println("╚══════════════════════════════╝");
            
            // Additional feature: Extended table option
            System.out.print("\nWould you like to see extended table (1-20)? (y/n): ");
            char extendChoice = scanner.next().charAt(0);
            
            if(extendChoice == 'y' || extendChoice == 'Y') {
                System.out.println("\n--- Extended Multiplication Table (11-20) ---");
                for(int i = 11; i <= 20; i++) {
                    int result = number * i;
                    System.out.printf("%d × %d = %d\n", number, i, result);
                }
            }
            
            System.out.print("\nDo you want to generate another table? (y/n): ");
            choice = scanner.next().charAt(0);
            System.out.println();
            
        } while(choice == 'y' || choice == 'Y');
        
        System.out.println("Thank you for using Multiplication Table Generator!");
        scanner.close();
    }
}