import java.lang.*;

public class SubarrayAverageSum{

    public static void main(String[] args) {

        int[] arr = new int[]{3, 7, 90, 20, 10, 50, 40};

        int B = 3;

        System.out.println(solve(arr, B));
    }

    static int solve(int[] A, int B) {


        // Sliding Window Technique
//        TC: O(N) & SC:O(N)

        int n = A.length;

        int sum = 0, result = 0;

        for(int i = 0; i<B; i++){

            sum += A[i];
        }

        int min_sum = sum;

        for(int i = B; i<n; i++){

            sum = sum + A[i] - A[i-B];

            if(sum < min_sum){

                min_sum = sum;

                result = i-B+1;
            }
        }
        return result;
    }
}
