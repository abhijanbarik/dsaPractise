import java.util.Arrays;

public class pascalsTriangle {

    public static void main(String[] args){

        int num = 10;

        int[][] rotatedMat = solve(num);

        for (int[] row : rotatedMat) {

            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] solve(int A) {

//        TC: O(N^2) & SC: O(N^2)

        int mat[][] = new int[A][A];

        if(A == 0) return mat;

        mat[0][0] = 1;

        for(int row = 1; row < A; row++){

            for(int col = 0; col <= row; col++){

                if(col == 0 || col == row) mat[row][col] = 1;

                else mat[row][col] = mat[row-1][col-1] + mat[row-1][col];
            }
        }

        return mat;
    }
}
