
public class MaxSumContiguousSubarray {
    public static void main(String[] args) {

        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(solve(arr));
    }

    static int solve(int[] A) {

        int sum = 0, maxValue = A[0];

        for(int i = 0; i < A.length; i++){

            sum = sum + A[i];

            maxValue = Math.max(sum, maxValue);

            if(sum < 0) sum = 0;
        }

        return maxValue;
    }
}
