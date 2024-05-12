
import java.lang.*;
public class Test {
    public static void main(String[] args) {


        String A = "the sky is blue";

        String ans = solve(A);

        System.out.println(ans);
    }

    public static String solve(String A) {

        String[] words = A.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();

        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {

            reversed.append(words[i]);

            if (i != 0) {

                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
