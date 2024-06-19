package EasyProblems;
import java.util.*;

public class LargestContinuousSequence_0_Sum {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, -3, 3};  // {1, 2, -2, 4, -4}

        int[] res = solve(arr);

        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int[] A){

        // TC: O(N) & SC: O(N) 

        int N = A.length;

        int maxLength = Integer.MIN_VALUE, maxLeft = Integer.MIN_VALUE, maxRight = Integer.MIN_VALUE;

        int sum = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(0, -1);   // // To handle the case when subarray starts from index 0

        for(int i = 0; i < N; i++){

            sum = sum + A[i];

            if(hm.containsKey(sum)){

                int oldIndex = hm.get(sum);

                int len = i - oldIndex;

                if(len > maxLength){

                    maxLength = len;

                    maxLeft = oldIndex + 1;

                    maxRight = i;
                }
            }else{

                hm.put(sum, i);
            }
        }

        if(maxLength == Integer.MIN_VALUE) return new int[]{};

        return Arrays.copyOfRange(A, maxLeft, maxRight + 1);
    }
}
