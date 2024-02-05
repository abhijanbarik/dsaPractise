import java.util.*;
public class prefixEven {
    public static void main(String[] args) {

        int[] arr = new int[]{3, -2, 4, 6, -3, 5};

        int[] res = evenIndex(arr);

        System.out.println(Arrays.toString(res));
    }

    static int[] evenIndex(int[] arr){

        int[] pfEven = new int[arr.length];

        pfEven[0] = arr[0];

        for(int i = 1; i < pfEven.length; i++){

            if((i & 1) == 1){

                pfEven[i] = pfEven[i-1];
            }else{

                pfEven[i] = pfEven[i-1] + arr[i];
            }
        }

        return pfEven;
    }
}
