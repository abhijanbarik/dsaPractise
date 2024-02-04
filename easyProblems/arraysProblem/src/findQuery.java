import java.util.*;
public class findQuery {
    // You are given N-array elements & Q-queries on the same array. For each query calculate sum of all elements in given range. [L-R] & [L <= R]
    public static void main(String[] args) {

            int[] arr = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter range for L -> ");
            int L = sc.nextInt();

            System.out.println("Enter range for R -> ");
            int R = sc.nextInt();

            System.out.println("The sum of all numbers int the range is: " + solution(arr, L, R));

    }

    static int solution(int[] A, int left, int right){


        // Optimisation with PreFix-Sum array: TC-> O(N + Q) -> As query will be there & SC -> O(N)
        // The code is slightly different, because driver-code is customizable.

        int[] pf = new int[A.length];

        pf[0] = A[0];

        for(int i = 1; i < A.length; i++){

            pf[i] = pf[i-1] + A[i];
        }

        int sum;

            if(left == 0) sum = pf[right];

            else sum = pf[right] - pf[left - 1];

            return sum;

//        Brute-Force -> TC: O(Q*N) & SC: O(1)
//        int sum = 0;
//        for (int i = left; i <= right; i++) {
//            sum = sum + A[i];
//        }
//        return sum;
    }

}
