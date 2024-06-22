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

        for(int idx = 0; idx < K; idx++){

            hm.put(A[idx], hm.getOrDefault(A[idx], 0) + 1);
        }

        res[0] = hm.size(); 

        int idx = 1;

        for(int start = 1, end = K; start <= (N-K); start++, end++){

            hm.put(A[start-1], hm.get(A[start-1]) - 1);

            if(hm.get(A[start-1]) == 0) hm.remove(A[start-1]);

            hm.put(A[end], hm.getOrDefault(A[end], 0) + 1);

            res[idx++] = hm.size();
        }

        return Arrays.copyOfRange(res, 0, idx);
    }
}
