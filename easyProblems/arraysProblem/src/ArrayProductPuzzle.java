import java.util.*;

public class ArrayProductPuzzle {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 1, 3, 4};

        int[] ans = solve(arr);

        System.out.println(Arrays.toString(ans));
    }

    static int[] solve(int[] A) {

//        This is in-place approach with single loop.
//        TC: O(N) & SC:O(1)

        int N = A.length;

        int[] res = new int[N];

        res[0] = 1;

        for(int i = 1; i < N; i++){

            res[i] = A[i-1] * res[i-1];
        }

        int sfProduct = 1;

        for(int i = N-1; i >= 0; i--){

            res[i] = res[i] * sfProduct;

            sfProduct = sfProduct * A[i];
        }

        return res;





    /*  Below approach is Prefix and Suffix Array */

//        TC : O(N) & SC: O(N)

//        int N = A.length;
//
//        int[] prefixProduct = new int[N];
//
//        prefixProduct[0] = 1;
//
//        for (int i = 1; i < N; i = i + 1){
//
//            prefixProduct[i] = A[i - 1] * prefixProduct[i - 1];
//        }
//
//        int[] suffixProduct = new int[N];
//
//        suffixProduct[N - 1] = 1;
//
//        for (int i = N - 2; i >= 0; i = i - 1){
//
//            suffixProduct[i] = A[i + 1] * suffixProduct[i + 1];
//        }
//
//        int[] product = new int[N];
//
//        for(int i = 0; i < N; i++){
//
//            product[i] = prefixProduct[i] * suffixProduct[i];
//        }
//
//        return product;
    }
}
