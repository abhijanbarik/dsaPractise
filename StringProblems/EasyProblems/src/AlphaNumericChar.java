import java.util.Arrays;

public class AlphaNumericChar {

    public static void main(String[] args) {

        char[] arr = new char[]{'S', 'c', 'a', '*', 'l', 'e', 'r', '#', '2', '0', '2', '4'};

        int ans = solve(arr);

        System.out.println(ans);
    }

    public static int solve(char[] A){

        // TC: O(N) & SC: O(1)

        int N = A.length;

        for(int i = 0; i < N; i++){

            if((A[i] < 65 || A[i] > 90) && (A[i] < 97 || A[i] > 122) && (A[i] < '0' || A[i] > '9'))
                return 0;
        }

        return 1;
    }
}
