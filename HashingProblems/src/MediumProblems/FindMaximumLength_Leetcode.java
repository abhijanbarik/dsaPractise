package MediumProblems;
import java.util.HashMap;

public class FindMaximumLength_Leetcode {

        public static void main(String[] args) {

            int[] arr = new int[]{0, 1, 1, 0, 1, 1, 1, 0};

            int ans = findMaxLength(arr);

            System.out.println(ans);
        }

        public static int findMaxLength(int[] A) {

            // TC: O(N) & SC: O(N)

            HashMap<Integer, Integer> hm = new HashMap<>();

            int ones = 0, zeroes = 0, maxLen = Integer.MIN_VALUE;

            hm.put(0, -1);

            for(int i = 0; i < A.length; i++){

                if(A[i] == 1) ones++;
                else zeroes++;

                int diff = zeroes - ones;

                if(hm.containsKey(diff)){

                    maxLen = Math.max(maxLen, i - hm.get(diff));

                }else{

                    hm.put(diff, i);
                }
            }

            if(maxLen == Integer.MIN_VALUE) return 0;

            return maxLen;
        }
}
