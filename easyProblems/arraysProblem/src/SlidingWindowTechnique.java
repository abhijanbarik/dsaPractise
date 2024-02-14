public class SlidingWindowTechnique {
    public static void main(String[] args) {

        int[] arr = new int[]{-3, 4, -2, 5, 3, -2, 8, 2, 1, 4};
        int k = 6;
        System.out.println(solution(arr, k));
    }

    static int solution(int[] arr, int k){

        // TC: O(N) & SC: O(1).

        int maximumSubArray, sum = 0;

        for(int i = 0; i < k; i++){

            sum = sum + arr[i];
        }

        maximumSubArray = sum;

        for(int start = 1, end = k; start <= (arr.length - k); start++, end++){

            sum = sum - arr[start-1] + arr[end];

            maximumSubArray = Math.max(maximumSubArray, sum);
        }

        return maximumSubArray;
    }
}
