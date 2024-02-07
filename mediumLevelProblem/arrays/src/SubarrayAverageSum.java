import java.lang.*;

public class SubarrayAverageSum{

    public static void main(String[] args) {

        int[] arr = new int[]{3, 7, 90, 20, 10, 50, 40};

        int B = 3;

        System.out.println(solve(arr, B));
    }

    static int solve(int[] A, int B) {


        // Sliding Window Technique
        // TC: O(N) & SC:O(N)

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


        // Brute Force Solution 
        // TC: O(N^2) & SC: O(1) -> We can take decimal to get the actual average of a number. However, if we take int or any othe rdata type like, float it will fail in some Test cases
        /*int minAvgIndex = 0;

        double minAvg = Double.MAX_VALUE;

        for (int i = 0; i <= A.length - B; i++) {

            double sum = 0;

            for (int j = i; j < i + B; j++) {

                sum = sum + A[j];
            }

            double avg = sum / B;

            if (avg < minAvg) {

                minAvg = avg;
                
                minAvgIndex = i;
            }
        }

        return minAvgIndex;*/
    }
}
