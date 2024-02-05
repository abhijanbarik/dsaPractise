import java.util.*;
public class pickFromBothSides {
    public static void main(String[] args) {

        int[] arr = new int[]{5, -2, 3, 1, 2};
        int B = 3;
        System.out.println(solve(arr, B));
    }

    public static int solve(int[] A, int B) {

        // This approach is using constant space. TC -> O(N) & SC -> O(1)

        int ans = 0, n = A.length;

        for(int i = 0; i < B; i++){

            ans = ans + A[i];
        }

        int temp = ans;

        for(int i = 0; i < B; i++){

            temp = temp - A[B-i-1] + A[n-i-1];

            ans = Math.max(temp, ans);
        }

        return ans;



        /* In this below approach we are using space */

        // TC -> O(N) & SC -> O(N)

//        int n = A.length;
//
//        // Prefix-Sum
//        int[] pfSum = new int[n];
//
//        pfSum[0] = A[0];
//
//        for(int i = 1; i < n; i++){
//
//            pfSum[i] = pfSum[i - 1] + A[i];
//        }
//
//
//        // Suffix-Sum
//        int[] sfSum = new int[n];
//
//        sfSum[n-1] = A[n-1];
//
//        for(int i = n-2; i >= 0; i--){
//
//            sfSum[i] = sfSum[i+1] + A[i];
//        }
//
//
//        int ans = Math.max( pfSum[ B-1 ], sfSum[ n-B ] );
//
//        for(int i = 1; i < B; i++){
//
//            int sum = pfSum[i-1] + sfSum[n-(B-i)];
//
//            ans = Math.max(ans, sum);
//        }
//
//        return ans;
    }
}
