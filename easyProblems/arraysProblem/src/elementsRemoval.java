import java.util.*;
public class elementsRemoval {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 2, 3, 1};

        int ans = solve(arr);

        System.out.println(ans);
    }
    public static  int solve(int[] A){

        // TC: O(Nlog(N)) & SC: O(1)

        int N = A.length;

        Arrays.sort(A);

        int cost = 0;

        for(int i = 0; i < N; i++){

            cost = cost + ((N - i) * A[i]);
        }

        return cost;
    }

}
