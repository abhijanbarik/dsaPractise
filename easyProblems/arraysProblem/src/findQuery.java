import java.util.*;
public class findQuery {
    // You are given N-array elements & Q-queries on the same array. For each query calculate sum of all elements in given range. [L-R] & [L <= R]
    public static void main(String[] args) {

            int[] arr = new int[]{8,1,2,9,4,9,1,4,4};

            int[][] twoArr = new int[][]{{1,7}};

//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Enter range for L -> ");
//            int L = sc.nextInt();
//
//            System.out.println("Enter range for R -> ");
//            int R = sc.nextInt();

            int[] ans = solution(arr, twoArr);

            System.out.println("The sum of all numbers int the range is: " + Arrays.toString(ans));

    }

    static int[] solution(int[] A, int[][] B){

        // TC -> O(N) & SC -> O(N)

        int[] res = new int[B.length];

        int[] pf = new int[A.length];

        pf[0] = A[0];

        for(int i = 1; i < A.length; i++){

            pf[i] = pf[i-1] + A[i];
        }


        for(int i = 0; i < B.length; i++){

            int left = B[i][0];

            int right = B[i][1];

            if(left == 0) res[i] = pf[right];

            else res[i] = pf[right] - pf[left - 1];
        }

        return res;



        // Optimisation with PreFix-Sum array: TC-> O(N + Q) -> As query will be there & SC -> O(N)
        // The code is slightly different, because driver-code is customizable.

//        int[] pf = new int[A.length];
//
//        pf[0] = A[0];
//
//        for(int i = 1; i < A.length; i++){
//
//            pf[i] = pf[i-1] + A[i];
//        }
//
//        int sum;
//
//            if(left == 0) sum = pf[right];
//
//            else sum = pf[right] - pf[left - 1];
//
//            return sum;

//        Brute-Force -> TC: O(Q*N) & SC: O(1)
//        int sum = 0;
//        for (int i = left; i <= right; i++) {
//            sum = sum + A[i];
//        }
//        return sum;
    }

}
