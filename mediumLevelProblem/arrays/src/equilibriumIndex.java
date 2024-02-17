public class equilibriumIndex {
    public static void main(String[] args) {
        int[] ar = new int[]{1,7,3,6,5,6};
        int ans = solve(ar);
        System.out.println(ans);
    }

    static int solve(int[] arr){

        // TC: O(N) & SC: O(N)

        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            pf[i] = pf[i-1] + arr[i];
        }

        int count = 0, left, right;

        for(int i = 0; i < pf.length; i++){

            if(i == 0) left = 0;
            else left = pf[i-1];

            right = pf[pf.length - 1] - pf[i];

            if(left == right) count++;
        }

        return count;


        // Optimising space TC: O(N) & SC: O(1)

        // int totalSum = 0;

        // for (int num : A) {

        //     totalSum = totalSum + num;
        // }

        // int leftSum = 0;

        // for (int i = 0; i < A.length; i++) {

        //     if (i > 0) {

        //         leftSum = leftSum + A[i - 1];
        //     }

        //     int rightSum = totalSum - leftSum - A[i];

        //     if (leftSum == rightSum) {
                
        //         return i;
        //     }
        // }
        // return -1;
    }
}
