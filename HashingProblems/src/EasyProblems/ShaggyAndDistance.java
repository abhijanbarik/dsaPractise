package EasyProblems;
import java.util.*;

public class ShaggyAndDistance {

    public static void main(String[] args) {


        int[] arr = new int[]{7, 1, 3, 4, 1, 7};

        int res = solve(arr);

        System.out.println(res);
    }

    public static int solve(int[] A){

        // TC: O(N) & SC: O(N)

            int N = A.length;

            int len , minLen = Integer.MAX_VALUE;

            HashMap<Integer, Integer> hm = new HashMap<>();

            for(int i = 0; i < N; i++){

                if(hm.containsKey(A[i])){

                    int oldIndex = hm.get(A[i]);

                    len = i - oldIndex;

                    minLen = Math.min(minLen, len);

                }else{

                    hm.put(A[i], i);
                }
            }

            if(minLen == Integer.MAX_VALUE) return -1;

            return minLen;
    }
}
