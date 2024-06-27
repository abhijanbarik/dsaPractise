import java.util.*;
public class ArithmeticProgression {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 1, 5};

        boolean ans = solve(arr);

        System.out.println(ans);
    }

    public static boolean solve(int[] A){

        // TC: O(Nlog(N)) & SC: O(1)

        int N = A.length;

        Arrays.sort(A);

        int diff = A[1] - A[0];

        for(int i = 2; i < N; i++){

            if(A[i] - A[i-1] != diff) return false;
        }

        return true;
    }
}
