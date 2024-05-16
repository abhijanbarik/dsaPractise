
public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String str = "acacacb";

        String ans = longestPalindrome(str);

        System.out.println(ans);
    }

    public static String longestPalindrome(String A) {

        // TC: O(N^2) & SC: O(N)

        int N = A.length();

        int maxLen = Integer.MIN_VALUE;

        StringBuilder S = new StringBuilder();

        for(int i = 0; i < N; i++){

            maxLen = solve(A, i, i, maxLen, S);
        }

        for(int j = 0; j < N-1; j++){

            maxLen = solve(A, j, j+1, maxLen, S);
        }

        return S.toString();
    }

    public static int solve(String A, int start, int end, int maxLen, StringBuilder S){

        while(start >= 0 && end < A.length() && A.charAt(start) == A.charAt(end)){

            start--;

            end++;
        }

        if(end-start-1 > maxLen){

            maxLen = end-start-1;

            S.setLength(0);

            S.append(A, start+1, end);
        }

        return maxLen;
    }
}
