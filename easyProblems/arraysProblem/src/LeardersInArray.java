import java.util.*;
public class LeardersInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{16, 17, 4, 3, 5, 2};

        int answer[] = leaderArray(arr);

        System.out.println(Arrays.toString(answer));
    }

    static int[] leaderArray(int[] A){

        int N = A.length, maxVal = Integer.MIN_VALUE, idx = 0;

        int[] res = new int[N];

        for(int i = N-1; i >= 0; i--){

            if(maxVal < A[i]){

                maxVal = A[i];

                res[idx++] = A[i];
            }
        }

        return Arrays.copyOfRange(res, 0, idx);
    }

}
