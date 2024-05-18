import java.util.*;
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] arr = new String[]{"abab", "ab", "abcd"};

        String ans = solve(arr);

        System.out.println(ans);
    }

    public static String solve(String[] A){

        // TC: O(NlogN) & SC: O(N)

        int N = A.length;

        Arrays.sort(A);

        int len = 0;

        for(int i = 0; i < A[0].length(); i++){

            if(A[0].charAt(i) == A[N-1].charAt(i))
                len++;

            else break;
        }

        return A[0].substring(0, len);
    }
}
