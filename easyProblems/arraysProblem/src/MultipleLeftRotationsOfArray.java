import java.util.*;
public class MultipleLeftRotationsOfArray {
    public static void main(String[] args) {

        int[] A = new int[]{1, 2, 3, 4, 5};

        int[] B = new int[]{2, 3};

        int[][] res = rotateArray(A, B);

        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] rotateArray(int[] A, int[] B){

        int[][] ans = new int[B.length][A.length];

        for(int row = 0; row < B.length; row++){

            int k = B[row] % A.length;

            for(int col = 0; col < A.length; col++){

                ans[row][col] = A[(col + k) % A.length];
            }
        }
        return ans;
    }
}
