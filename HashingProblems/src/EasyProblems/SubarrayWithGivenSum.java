package EasyProblems;
import java.util.*;
public class SubarrayWithGivenSum {
    public static void main(String[] args) {

        int[] arr = new int[]{8, -2, 3, 4, 2, -1, 6};
        int value = 5;
        int[] res = solve(arr, value);
        System.out.println(Arrays.toString(res));
    }

    public static int[] solve(int[] A, int B) {

        // TC: O(N) & SC: O(N)

        int N = A.length;

        HashMap<Long, Integer> hm = new HashMap<>();

        long sum = 0;

        hm.put(0l, -1);

        int startIndex = -1, endIndex = -1;

        for(int i = 0; i < N; i++){

            sum = sum + A[i];

            if(hm.containsKey(sum - B)){

                startIndex = hm.get(sum - B) + 1;

                endIndex = i;

                break;
            }

            hm.put(sum, i);
        }

        if(startIndex == -1){

            return new int[]{-1};
        }

        return Arrays.copyOfRange(A, startIndex, endIndex + 1);
    }
}
