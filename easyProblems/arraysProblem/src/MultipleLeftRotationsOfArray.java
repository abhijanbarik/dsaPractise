import java.util.*;
public class MultipleLeftRotationsOfArray {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};

        int B = 6;

        int[] ans = solve(arr, B);

        System.out.println(Arrays.toString(ans));
    }

    static int[] solve(int[] A, int B) {

//        TC: O(N) & SC: O(N)

        B = B % A.length;

        int N = A.length;

        int[] res = new int[N];

        for(int i = 0; i < N; i++){

            res[i] = A[(i + B) % N];
        }

        return res;
    }

//    static int[] solve(int[] A, int B) {

//    TC : O(N) & SC: O(1)
//
//        B = B % A.length;
//
//        int N = A.length;
//
//        rotateArray(A, 0, N-1);
//
//        rotateArray(A, 0, B);
//
//        rotateArray(A, B+1, N-1);
//
//        return A;
//    }

//    static void rotateArray(int[] A, int S, int E){
//
//        while(S <= E){
//
//            int temp = A[S];
//
//            A[S] = A[E];
//
//            A[E] = temp;
//
//            S++;
//
//            E--;
//        }
//    }




/*    This is Solved as per Scaler problem set.  */

//    public static void main(String[] args) {
//
//        int[] A = new int[]{1, 2, 3, 4, 5};
//
//        int[] B = new int[]{2, 3};
//
//        int[][] res = rotateArray(A, B);
//
//        for (int[] row : res) {
//            System.out.println(Arrays.toString(row));
//        }
//    }
//
//    static int[][] rotateArray(int[] A, int[] B){
//
//        // TC-> O(N^2) & SC-> O(N^2)
//
//        int[][] ans = new int[B.length][A.length];
//
//        for(int row = 0; row < B.length; row++){
//
//            int k = B[row] % A.length;
//
//            for(int col = 0; col < A.length; col++){
//
//                ans[row][col] = A[(col + k) % A.length];
//            }
//        }
//        return ans;
//    }
}
