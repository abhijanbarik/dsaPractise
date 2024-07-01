package EasyProblems;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] arr = new int[]{100, 4, 200, 1, 3, 2};

        int ans = solve(arr);

        System.out.println(ans);
    }

    public static int solve(int[] A){

        // TC: O(N) & SC: O(N) 

        int N = A.length, maxVal = Integer.MIN_VALUE;

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < N; i++){

            hs.add(A[i]);
        }

        for(int i = 0; i < N; i++){

            if(!hs.contains(A[i] - 1)){

                int val = A[i];

                int count = 1;

                while(hs.contains(val + 1)){

                    count++;

                    val++;
                }

                maxVal = Math.max(count, maxVal);
            }
        }

        return maxVal;
    }
}
