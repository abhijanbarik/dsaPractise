public class equilibriumIndex {
    public static void main(String[] args) {
        int[] ar = new int[]{-7, 1, 5, 2, -4, 3, 0};

        int ans = solve(ar);

        System.out.println(ans);
    }

    static int solve(int[] arr){

        /* More Optimised solution*/
        // TC: O(N) & SC:O(1) 

        int N = arr.length;

        int totalSum = 0;

        for(int i : arr){

            totalSum = totalSum + i;
        }

        int left = 0, right = totalSum;

        for(int i = 0; i < N; i++){

            right = right - arr[i];

            if(left == right) return i;

            left = left + arr[i];
        }

        return -1;




        // TC: O(N) & SC: O(N)

//        int[] pf = new int[arr.length];
//
//        pf[0] = arr[0];
//
//        for(int i = 1; i < arr.length; i++){
//
//            pf[i] = pf[i-1] + arr[i];
//        }
//
//        int count = 0, left, right;
//
//        for(int i = 0; i < pf.length; i++){
//
//            if(i == 0) left = 0;
//
//            else left = pf[i-1];
//
//            right = pf[pf.length - 1] - pf[i];
//
//            if(left == right) return i;
//        }
//
//        return -1;
    }
}
