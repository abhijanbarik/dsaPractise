
public class MaximumSatisfaction {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 15, 4, 14};

        int ans = solve(arr);

        System.out.println(ans);
    }

    public static int solve(int[] A) {

        int ans = 0;

        for(int i = 31; i >= 0; i--){

            int countOnes = 0;

            int checkOnes = ans | (1 << i);

            for(int j = 0; j < A.length; j++){

                if((A[j] & checkOnes) == checkOnes){

                    countOnes++;
                }
            }

            if(countOnes >= 4){

                ans = checkOnes;
            }
        }

        return ans;
    }
}
