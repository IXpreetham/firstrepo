import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}


import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        int lcm = calculateLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Function to calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

 # A simple program to greet a user
name = "Alice" # A string variable
age = 30      # An integer variable

print("Hello, " + name + "!") # Prints "Hello, Alice!"
print("You are", age, "years old.") # Prints "You are 30 years old."

}
