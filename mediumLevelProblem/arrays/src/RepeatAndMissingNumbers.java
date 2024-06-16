import java.util.*;
public class RepeatAndMissingNumbers {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 1, 2, 5, 3};

        int[] ans = solve(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(final int[] A){

        // TC: O(N) & SC: O(1) 

        int N = A.length;

        /* Cyclic-Sort Algorithm*/
        for(int i = 0; i < N;){

            int correctIndex = A[i] - 1;

            if(A[i] != A[correctIndex]){

                swapFun(A, i, correctIndex);

            } else {

                i++;
            }
        }

        int[] res = new int[2];

        /* Find the Missing and Repeated Numbers */
        for(int i = 0; i < N; i++){

            if(A[i] != i + 1){

                res[0] = A[i];

                res[1] = i + 1;
            }
        }

        return res;
    }

    public static void swapFun(int[] A, int start, int end) {

        int temp = A[start];

        A[start] = A[end];

        A[end] = temp;
    }
}
