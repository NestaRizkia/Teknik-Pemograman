import java.math.BigInteger;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        System.out.print("Enter the number of test cases: ");
        int numTestCases = scanner.nextInt();
         // Consume newline
        
        // Array to store all test case values
        BigInteger[] testCases = new BigInteger[numTestCases];
        
        // Read all test case values
        for (int i = 0; i < numTestCases; i++) {
            System.out.print("Enter the integer for test case " + (i + 1) + ": ");
            testCases[i] = scanner.nextBigInteger();
             // Consume newline
        }

        // Process each test case and display the result
        for (int i = 0; i < numTestCases; i++) {
            fitInPrimitive(testCases[i]);
        }

        scanner.close();
    }

    public static void fitInPrimitive(BigInteger n) {
        // Define the maximum and minimum values for each primitive data type
        BigInteger byteMin = BigInteger.valueOf(Byte.MIN_VALUE);
        BigInteger byteMax = BigInteger.valueOf(Byte.MAX_VALUE);
        BigInteger shortMin = BigInteger.valueOf(Short.MIN_VALUE);
        BigInteger shortMax = BigInteger.valueOf(Short.MAX_VALUE);
        BigInteger intMin = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger longMin = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);

        // Check if the number can fit in each data type and print the results
        System.out.println(n + " can be fitted in:");
        if (n.compareTo(byteMin) >= 0 && n.compareTo(byteMax) <= 0) {
            System.out.println("* byte");
        }
        if (n.compareTo(shortMin) >= 0 && n.compareTo(shortMax) <= 0) {
            System.out.println("* short");
        }
        if (n.compareTo(intMin) >= 0 && n.compareTo(intMax) <= 0) {
            System.out.println("* int");
        }
        if (n.compareTo(longMin) >= 0 && n.compareTo(longMax) <= 0) {
            System.out.println("* long");
        }
        if (n.compareTo(longMax) > 0 || n.compareTo(longMin) < 0) {
            System.out.println(n + " can't be fitted anywhere.");
        }
    }
}
