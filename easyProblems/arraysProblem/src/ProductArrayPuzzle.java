import java.util.*;
public class ProductArrayPuzzle {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] res = prefixAndSufix(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] prefixAndSufix(int[] A){

        int N = A.length;

        int[] pfProd = new int[N];

        pfProd[0] = A[0];

        for(int i = 1; i < N; i++) {

            pfProd[i] = pfProd[i-1] * A[i];
        }

        int[] sfProd = new int[N];

        sfProd[N-1] = A[N-1];

        for(int i = N-2; i >= 0; i--){

            sfProd[i] = sfProd[i+1] * A[i];
        }

        int[] res = new int[N];

        res[0] = sfProd[1];

        res[N-1] = pfProd[N-2];

        for(int i = 1; i < N-1; i++){

            res[i] = pfProd[i-1] * sfProd[i+1];
        }

        return res;
    }
}
