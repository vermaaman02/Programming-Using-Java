// AllInOnePrograms.java
import java.util.Scanner;

public class AllInOnePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Multiplication Table (1 to 10)");
            System.out.println("2. Factorial (using for loop)");
            System.out.println("3. Fibonacci series up to n terms");
            System.out.println("4. Check Prime Number");
            System.out.println("5. Reverse digits of a number");
            System.out.println("6. Check Palindrome Number");
            System.out.println("7. Check Armstrong Number");
            System.out.println("8. Sum of Digits");
            System.out.println("9. Count Digits");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                // Q1: Multiplication Table
                case 1:
                    System.out.print("Enter a number: ");
                    int num1 = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num1 + " x " + i + " = " + (num1 * i));
                    }
                    break;

                // Q2: Factorial using for loop
                case 2:
                    System.out.print("Enter a number: ");
                    int num2 = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= num2; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial = " + fact);
                    break;

                // Q3: Fibonacci series
                case 3:
                    System.out.print("Enter number of terms: ");
                    int terms = sc.nextInt();
                    int a = 0, b = 1;
                    System.out.print("Fibonacci Series: ");
                    for (int i = 1; i <= terms; i++) {
                        System.out.print(a + " ");
                        int next = a + b;
                        a = b;
                        b = next;
                    }
                    System.out.println();
                    break;

                // Q4: Prime check
                case 4:
                    System.out.print("Enter a number: ");
                    int num4 = sc.nextInt();
                    boolean isPrime = true;
                    if (num4 <= 1) isPrime = false;
                    else {
                        for (int i = 2; i <= num4 / 2; i++) {
                            if (num4 % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) System.out.println(num4 + " is Prime.");
                    else System.out.println(num4 + " is Not Prime.");
                    break;

                // Q5: Reverse digits
                case 5:
                    System.out.print("Enter a number: ");
                    int num5 = sc.nextInt();
                    int rev = 0, temp5 = num5;
                    while (temp5 != 0) {
                        rev = rev * 10 + (temp5 % 10);
                        temp5 /= 10;
                    }
                    System.out.println("Reversed = " + rev);
                    break;

                // Q6: Palindrome check
                case 6:
                    System.out.print("Enter a number: ");
                    int num6 = sc.nextInt();
                    int original = num6, revNum = 0;
                    int temp6 = num6;
                    while (temp6 != 0) {
                        revNum = revNum * 10 + (temp6 % 10);
                        temp6 /= 10;
                    }
                    if (original == revNum)
                        System.out.println(original + " is Palindrome.");
                    else
                        System.out.println(original + " is Not Palindrome.");
                    break;

                // Q7: Armstrong number check
                case 7:
                    System.out.print("Enter a number: ");
                    int num7 = sc.nextInt();
                    int sum = 0, digits = 0;
                    int temp7 = num7;

                    // count digits
                    while (temp7 != 0) {
                        digits++;
                        temp7 /= 10;
                    }

                    // compute Armstrong sum
                    temp7 = num7;
                    while (temp7 != 0) {
                        int digit = temp7 % 10;
                        sum += Math.pow(digit, digits);
                        temp7 /= 10;
                    }

                    if (sum == num7)
                        System.out.println(num7 + " is an Armstrong Number.");
                    else
                        System.out.println(num7 + " is Not an Armstrong Number.");
                    break;

                // Q8: Sum of digits
                case 8:
                    System.out.print("Enter a number: ");
                    int num8 = sc.nextInt();
                    int sumDigits = 0;
                    int temp8 = Math.abs(num8);
                    while (temp8 != 0) {
                        sumDigits += temp8 % 10;
                        temp8 /= 10;
                    }
                    System.out.println("Sum of digits = " + sumDigits);
                    break;

                // Q9: Count digits
                case 9:
                    System.out.print("Enter a number: ");
                    int num9 = sc.nextInt();
                    int count = 0;
                    int temp9 = Math.abs(num9);
                    if (temp9 == 0) count = 1;
                    else {
                        while (temp9 != 0) {
                            count++;
                            temp9 /= 10;
                        }
                    }
                    System.out.println("Number of digits = " + count);
                    break;

                // Exit option
                case 0:
                    System.out.println("Exiting program... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
