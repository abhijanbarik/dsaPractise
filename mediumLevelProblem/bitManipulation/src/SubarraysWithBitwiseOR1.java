
public class SubarraysWithBitwiseOR1 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 0, 0 , 0, 1, 0, 0};

        long ans = solve(arr);

        System.out.println(ans);
    }

    public static long solve(int[] A){

//        TC: O(N) & SC: O(1) 

        long n = A.length;

        long count = 0, calZero = 0;

        for(int i = 0; i < n; i++){

            if(A[i] == 0) calZero++;

            else {

                count = count + (calZero * (calZero + 1) / 2);

                calZero = 0;
            }
        }

        count = count + (calZero * (calZero + 1) / 2);

        return (n * (n + 1) / 2) - count;
    }
}
