public class SumOfAllSubarrays {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4};

        int ans = solve(arr);

        System.out.println(ans);
    }

    public static int solve(int[] A){

//        TC: O(N) & SC: O(1)

        int N = A.length;

        int sumVal = 0;

        for(int i = 0; i < N; i++){

            int left = i + 1;                  // We can also write -> sumVal = sumVal + ((i + 1) * (N-1)) * A[i];

            int right = N - i;

            int val = left * right;

            sumVal = sumVal + (val * A[i]);
        }

        return sumVal;
    }
}
