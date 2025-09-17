import java.util.Scanner;

public class MathClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("\n--- Math Class Methods Demonstration ---");

        // 1. Basic Operations
        System.out.println("\n[1] Basic Operations:");
        System.out.println("abs(" + a + ") = " + Math.abs(a));
        System.out.println("max(" + a + ", " + b + ") = " + Math.max(a, b));
        System.out.println("min(" + a + ", " + b + ") = " + Math.min(a, b));

        // 2. Power and Roots
        System.out.println("\n[2] Power and Roots:");
        System.out.println("pow(" + a + ", " + b + ") = " + Math.pow(a, b));
        System.out.println("sqrt(" + a + ") = " + Math.sqrt(a));
        System.out.println("cbrt(" + a + ") = " + Math.cbrt(a));

        // 3. Rounding Functions
        System.out.println("\n[3] Rounding Functions:");
        System.out.println("ceil(" + a + ") = " + Math.ceil(a));
        System.out.println("floor(" + a + ") = " + Math.floor(a));
        System.out.println("round(" + a + ") = " + Math.round(a));
        System.out.println("rint(" + a + ") = " + Math.rint(a));

        // 4. Trigonometric Functions
        System.out.println("\n[4] Trigonometric Functions (input in radians):");
        System.out.println("sin(" + a + ") = " + Math.sin(a));
        System.out.println("cos(" + a + ") = " + Math.cos(a));
        System.out.println("tan(" + a + ") = " + Math.tan(a));
        System.out.println("asin(0.5) = " + Math.asin(0.5));
        System.out.println("acos(0.5) = " + Math.acos(0.5));
        System.out.println("atan(" + a + ") = " + Math.atan(a));

        // 5. Exponential and Logarithmic Functions
        System.out.println("\n[5] Exponential and Logarithmic Functions:");
        System.out.println("exp(" + a + ") = " + Math.exp(a));
        System.out.println("log(" + a + ") = " + Math.log(a));
        System.out.println("log10(" + a + ") = " + Math.log10(a));

        // 6. Other Functions
        System.out.println("\n[6] Other Functions:");
        System.out.println("random() = " + Math.random());
        System.out.println("signum(" + a + ") = " + Math.signum(a));
        System.out.println("toRadians(180) = " + Math.toRadians(180));
        System.out.println("toDegrees(Math.PI) = " + Math.toDegrees(Math.PI));

        sc.close();
    }
}
