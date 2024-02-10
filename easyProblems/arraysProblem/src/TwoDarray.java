import java.util.*;
public class TwoDarray {

    public static void main(String[] args) {


        int[][] arr = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,2,3,4}};

        System.out.println(Arrays.toString(solve(arr)));
    }

    static int[] solve(int[][] A){

        // Column-Sum -> TC: O(N*M), SC: O(N)

        int[] res = new int[A[0].length];

        for(int col = 0; col < A[0].length; col++){

            int sum = 0;

            for(int row = 0; row < A.length; row++){

                sum = sum + A[row][col];
            }
            res[col] = sum;
        }
        return res;
    }
}
