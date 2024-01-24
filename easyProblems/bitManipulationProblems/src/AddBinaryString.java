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

        StringBuilder str = new StringBuilder();

      int lenA = A.length() - 1, lenB = B.length() - 1, carry = 0;

      while(lenA >= 0 || lenB >= 0){

          int sum = carry;

          if(lenA >= 0) sum = sum + A.charAt(lenA) - '0';

          if(lenB >= 0) sum = sum + B.charAt(lenB) - '0';

          str.insert(0, sum % 2);

          carry = sum / 2;

          lenA--;

          lenB--;
      }

      if(carry > 0) str.insert(0, carry);

      return str.toString();
    }
}
