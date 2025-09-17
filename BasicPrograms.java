// BasicPrograms.java
import java.util.Scanner;
import java.math.BigInteger;

public class BasicPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Basic Java Programs Menu ===");
            System.out.println("1. Multiplication table 1 to 10");
            System.out.println("2. Factorial (using for loop)");
            System.out.println("3. Fibonacci series up to n terms");
            System.out.println("4. Check prime");
            System.out.println("5. Reverse digits of a number");
            System.out.println("6. Check palindrome (number)");
            System.out.println("7. Check Armstrong number");
            System.out.println("8. Sum of digits of a number");
            System.out.println("9. Count digits in a number");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter number for table: ");
                    int n1 = sc.nextInt();
                    printTable(n1);
                    break;
                case 2:
                    System.out.print("Enter non-negative integer for factorial: ");
                    int n2 = sc.nextInt();
                    System.out.println("Factorial: " + factorial(n2).toString());
                    break;
                case 3:
                    System.out.print("Enter number of terms for Fibonacci (>=1): ");
                    int n3 = sc.nextInt();
                    printFibonacci(n3);
                    break;
                case 4:
                    System.out.print("Enter number to check prime: ");
                    int n4 = sc.nextInt();
                    System.out.println(n4 + (isPrime(n4) ? " is prime." : " is not prime."));
                    break;
                case 5:
                    System.out.print("Enter number to reverse: ");
                    long n5 = sc.nextLong();
                    System.out.println("Reversed: " + reverseNumber(n5));
                    break;
                case 6:
                    System.out.print("Enter number to check palindrome: ");
                    long n6 = sc.nextLong();
                    System.out.println(n6 + (isPalindrome(n6) ? " is a palindrome." : " is not a palindrome."));
                    break;
                case 7:
                    System.out.print("Enter number to check Armstrong: ");
                    int n7 = sc.nextInt();
                    System.out.println(n7 + (isArmstrong(n7) ? " is an Armstrong number." : " is not an Armstrong number."));
                    break;
                case 8:
                    System.out.print("Enter number to sum digits: ");
                    long n8 = sc.nextLong();
                    System.out.println("Sum of digits: " + sumOfDigits(n8));
                    break;
                case 9:
                    System.out.print("Enter number to count digits: ");
                    long n9 = sc.nextLong();
                    System.out.println("Number of digits: " + countDigits(n9));
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    // 1. Multiplication table 1..10
    static void printTable(int x) {
        System.out.println("Multiplication table for " + x + " (1 to 10):");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %d%n", x, i, x * i);
        }
    }

    // 2. Factorial using for loop (BigInteger to avoid overflow)
    static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial undefined for negative numbers.");
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    // 3. Fibonacci series up to n terms
    static void printFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive integer for terms.");
            return;
        }
        System.out.println("Fibonacci series (" + terms + " terms):");
        long a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + (i == terms ? "\n" : " "));
            long next = a + b;
            a = b;
            b = next;
        }
    }

    // 4. Check prime
    static boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x <= 3) return true;
        if (x % 2 == 0) return false;
        int limit = (int) Math.sqrt(x);
        for (int i = 3; i <= limit; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    // 5. Reverse digits
    static long reverseNumber(long num) {
        long n = Math.abs(num);
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return num < 0 ? -rev : rev;
    }

    // 6. Palindrome (number)
    static boolean isPalindrome(long num) {
        return num == reverseNumber(num);
    }

    // 7. Armstrong number
    static boolean isArmstrong(int num) {
        if (num < 0) return false;
        int original = num;
        int digits = countDigits(num);
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int d = temp % 10;
            sum += intPow(d, digits);
            temp /= 10;
        }
        return sum == original;
    }

    // helper: integer power (d^p)
    static int intPow(int base, int exp) {
        int r = 1;
        for (int i = 0; i < exp; i++) r *= base;
        return r;
    }

    // 8. Sum of digits
    static int sumOfDigits(long num) {
        long n = Math.abs(num);
        int sum = 0;
        while (n != 0) {
            sum += (int) (n % 10);
            n /= 10;
        }
        return sum;
    }

    // 9. Count digits in a number
    static int countDigits(long num) {
        if (num == 0) return 1;
        int count = 0;
        long n = Math.abs(num);
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
