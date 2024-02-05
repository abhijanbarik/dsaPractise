import java.util.Arrays;

public class prefixOdd {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 4, 6, -3, 5};

        int[] res = oddIndex(arr);

        System.out.println(Arrays.toString(res));
    }

    static int[] oddIndex(int[] A){

        // TC: O(N) & O(N)

        int[] pfOdd = new int[A.length];

        pfOdd[0] = 0;

        for(int i = 1; i < A.length; i++){

            if((i & 1) == 1){

                pfOdd[i] = pfOdd[i-1] + A[i];
            }else{

                pfOdd[i] = pfOdd[i-1];
            }
        }

        return pfOdd;
    }
}
