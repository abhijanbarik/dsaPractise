import java.util.*;

public class MaximumPositive {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 6, -1, 7, 8};

        int[] ans = solve(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[] A) {

        int N = A.length, start = -1, end = -1, len = 0, maxLen = 0, actualStart = -1, actualEnd = -1;

        for(int i = 0; i < N; i++){

            if(A[i] > 0){

                len++;

                if(start == -1){

                    start = i;
                }

                end = i;
            }

            if(len > maxLen){

                maxLen = len;

                actualStart = start;

                actualEnd = end;
            }

            else if(A[i] < 0){

                start = -1;

                end = -1;

                len = 0;
            }
        }

        int size = actualEnd - actualStart + 1;

        int idx = 0;

        int[] res = new int[size];

        for(int i = actualStart; i <= actualEnd; i++){

            res[idx++] = A[i];
        }

        return res;
    }
}
