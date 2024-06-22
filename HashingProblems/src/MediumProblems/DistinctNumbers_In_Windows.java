package MediumProblems;
import java.util.*;
public class DistinctNumbers_In_Windows {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 3, 8, 3, 9, 4, 9, 4, 10};

        int windowSize = 4;

        int[] ans = solve(arr, windowSize);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[] A, int K){

        // TC: O(N) & SC: O(N)

        int N = A.length;

        int[] res = new int[N-K+1];

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < K; i++){

            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }

        res[0] = hm.size();

        int idx = 1;

        for(int i = 1, j = K; i <= (N-K); i++, j++){

            hm.put(A[i-1], hm.get(A[i-1]) - 1);

            if(hm.get(A[i-1]) == 0) hm.remove(A[i-1]);

            hm.put(A[j], hm.getOrDefault(A[j], 0) + 1);

            res[idx++] = hm.size();
        }

        return Arrays.copyOfRange(res, 0, idx);
    }
}
