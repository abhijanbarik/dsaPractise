import java.util.*;
public class NobelInteger {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3};                      // {3, 1, 2, 3}

        int ans = solve(arr);

        System.out.println(ans);
    }

    public static int solve(int[] A){

        // TC: O(Nlog(N)) & SC: O(1)

        int N = A.length;

        Arrays.sort(A);

        for(int i = 0; i < N; i++){

            while(i+1 < N && A[i] == A[i+1]) i++;

            if(A[i] == (N-i-1)) return 1;
        }

        return -1;
    }
}
