import java.util.*;
public class prefixSum {
    public static void main(String[] args) {

        int[] arr = new int[]{2, -4, 7, 6, -1, 3, -5, 8};

        int[] res = sumArr(arr);

        System.out.println(Arrays.toString(res));
    }

    static int[] sumArr(int[] arr){

        int[] pf = new int[arr.length];

        pf[0] = arr[0];

        for(int i = 1; i < arr.length; i++){

            pf[i] = pf[i-1] + arr[i];
        }

        return pf;
    }
}
