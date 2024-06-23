package MediumProblems;
import java.util.*;
public class PairWithGivenXor {
    public static void main(String[] args) {


        int[] arr = new int[]{3, 6, 8, 10, 15, 50};

        int val = 5;

        int ans = solve(arr, val);

        System.out.println(ans);
    }

    public static int solve(int[] A, int val){

        // TC: O(N) & SC: O(N)  

        int N = A.length;

        int count = 0;

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < N; i++){

            if(hs.contains(A[i] ^ val) && A[i] != val){

                count++;
            }

            hs.add(A[i]);
        }

        return count;
    }
}
