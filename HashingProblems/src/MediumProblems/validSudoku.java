package MediumProblems;
import java.util.*;
public class validSudoku {
    public static void main(String[] args) {

        final String[] arr = new String[]{"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};

        boolean ans = solve(arr);

        System.out.println(ans);
    }

    public static boolean solve(final String[] A){

        // TC: O(1) & SC: O(1)

        HashSet<String> hs = new HashSet<>();

        for(int row = 0; row < 9; row++){

            for(int col = 0; col < 9; col++){

                if(A[row].charAt(col) == '.') continue;

                String rowKey = Character.toString(A[row].charAt(col)) + "_ROW_" + Integer.toString(row);

                String colKey = Character.toString(A[row].charAt(col)) + "_COL_" + Integer.toString(col);

                String box = Character.toString(A[row].charAt(col)) + "_BOX_" + Integer.toString(row/3) + "_" + Integer.toString(col/3);

                if(hs.contains(rowKey) || hs.contains(colKey) || hs.contains(box)) return false;

                hs.add(rowKey);
                hs.add(colKey);
                hs.add(box);
            }
        }

        return true;
    }
}
