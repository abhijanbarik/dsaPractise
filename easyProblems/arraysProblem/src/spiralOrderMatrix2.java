import java.util.Arrays;

public class spiralOrderMatrix2 {

    public static void main(String[] args){

        int num = 5;

        int[][] rotatedMat = spiralMatrix(num);

        for (int[] row : rotatedMat) {

            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] spiralMatrix (int A){

        TC: O(N^2) & SC: O(N^2)

        int[][] mat = new int[A][A];

        int count = 1;

        int rowSize = mat.length, colSize = mat[0].length;

        int rowStart = 0, rowEnd = rowSize - 1;

        int colStart = 0, colEnd = colSize - 1;

        while(rowStart <= rowEnd && colStart <= colEnd){

            for(int col = colStart; col <= colEnd; col++){

                mat[rowStart][col] = count++;
            }

            rowStart++;

            for(int row = rowStart; row <= rowEnd; row++){

                mat[row][colEnd] = count++;
            }

            colEnd--;

            for(int col = colEnd; col >= colStart; col--){

                mat[rowEnd][col] = count++;
            }

            rowEnd--;

            for(int row = rowEnd; row >= rowStart; row--){

                mat[row][colStart] = count++;
            }

            colStart++;
        }

        return mat;
    }
}
