import java.util.*;
public class SortByColor {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 0, 0, 1, 2, 1, 2, 2, 0, 0, 1, 2, 0, 1};

        int[] ans = solve(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[] A){

//        TC: O(N) & SC: O(N)

        int N = A.length;

        int redCount = 0, whiteCount = 0, blueCount = 0;

        for(int i = 0; i < N; i++){

            if(A[i] == 0) redCount++;
            else if(A[i] == 1) whiteCount++;
            else blueCount++;
        }

        for(int i = 0; i < N; i++){

            if(redCount > 0){

                A[i] = 0;

                redCount--;

            }else if(whiteCount > 0){

                A[i] = 1;

                whiteCount--;

            }else{

                A[i] = 2;

                blueCount--;
            }
        }

        return A;
    }
}
