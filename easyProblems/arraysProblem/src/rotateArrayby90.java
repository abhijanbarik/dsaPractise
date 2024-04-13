import java.util.Arrays;

public class rotateArrayby90 {

    public static void main(String[] args){

        int[][] mat = new int[][]{{1, 2}, {3, 4}};

        int[][] rotatedMat = rotateArray(mat);

        for (int[] row : rotatedMat) {

            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] rotateArray(int[][] A){

        int N = A.length;

        for(int row = 0; row < N; row++){

            for(int col = 0; col < N; col++){

                int temp = A[row][col];

                A[row][col] = A[col][row];

                A[col][row] = temp;
            }
        }

        for(int row = 0; row < N; row++){

            for(int col = 0; col < N/2; col++){

                int temp = A[row][col];

                A[row][col] = A[row][N-col-1];

                A[row][N-col-1] = temp;
            }
        }

        return A;
    }
}
