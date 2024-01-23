import java.util.*;
import java.lang.*;
public class AddBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first binary number: ");
        String A = sc.next();

        System.out.println("Enter second binary number: ");
        String B = sc.next();

        String Ans = addBinary(A, B);
        System.out.println(Ans);
    }
    static String addBinary(String A, String B) {

        StringBuilder reversedA = new StringBuilder(A).reverse();
        StringBuilder reversedB = new StringBuilder(B).reverse();
        // Find the maximum length of the input strings
        int maxLength = Math.max(A.length(), B.length());
        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder(maxLength + 1); // +1 for possible carry
        // Initialize a variable to store the carry
        int carry = 0;
        // Iterate through each bit position
        for (int i = 0; i < maxLength || carry > 0; i++) {
            // Get the current bit of A (or 0 if A is shorter)
            int bitA = i < A.length() ? reversedA.charAt(i) - '0' : 0;
            // Get the current bit of B (or 0 if B is shorter)
            int bitB = i < B.length() ? reversedB.charAt(i) - '0' : 0;
            // Calculate the sum of the bits and the carry
            int sum = bitA + bitB + carry;
            // Append the least significant bit of the sum to the result
            result.append(sum % 2);
            // Update the carry for the next iteration
            carry = sum / 2;
        }
        // Reverse the final result before converting it to a string
        return result.reverse().toString();
    }
}
