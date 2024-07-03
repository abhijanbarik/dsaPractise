public class palindromeUsingRecursion {

    public static void main(String[] args) {


        String str = "aabbcbbaa";

        int ans = solve(str);

        System.out.println(ans);
    }

    public static int solve(String A){

        // TC: O(N) & SC: O(N)

        int N = A.length();

        int start = 0, end = N-1;

        boolean ans = checkPal(A, start, end);

        int res = ans ? 1 : 0;

        return res;
    }

    public static boolean checkPal(String A, int start, int end) {

        if (start >= end) return true;

        if (A.charAt(start) == A.charAt(end)) {

            return checkPal(A, start + 1, end - 1);
        }

        return false;
    }
}
