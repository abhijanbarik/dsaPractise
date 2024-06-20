package EasyProblems;
import java.util.*;

public class KOccurrences {

    public static void main(String[] args) {

        int size = 8, freq = 3;        // Be mindful to change the size and freq as-per the testCases.

        int[] arr = new int[]{2, 4, 2, 2, 1, 4, 5, 4};      // Testcases -> {1, 2, 2, 3, 3}, {0, 0, 1}, {1, 2, 3, 4, 5}

        int ans = solve(size, freq, arr);

        System.out.println(ans);
    }
    public static int solve(int A, int B, int[] C){

        // TC: O(N) & SC: O(N)  

        int mod = 1000000007;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < A; i++){

            hm.put(C[i], hm.getOrDefault(C[i], 0) + 1);
        }

        int sum = 0 , flag = 0;

        for(int i = 0; i < A; i++){

            if(hm.containsKey(C[i]) && hm.get(C[i]) == B){

                sum = (sum + C[i]) % mod;

                hm.put(C[i], hm.get(C[i]) - 1);

                flag = 1;
            }
        }

        if(flag == 0) return -1;

        return sum;
    }
}
