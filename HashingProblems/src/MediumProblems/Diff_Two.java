package MediumProblems;
import java.util.*;
public class Diff_Two {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 3};

        int value = 2;

        boolean ans = solve(arr, value);

        System.out.println(ans);
    }
    public static boolean solve(int[] A, int B){

        // TC: O(N) & SC: O(N)  

        int N = A.length;

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < N; i++){

            if(hs.contains(A[i] - B) || hs.contains(A[i] + B)){

                return true;
            }

            hs.add(A[i]);
        }

        return false;
    }
}
