import java.util.Arrays;

public class singleNumber3 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 2, 1, 5};

        int[] res;

        res = singleNumberTwo(arr);

        System.out.println(Arrays.toString(res));
    }

    static int[] singleNumberTwo(int[] A){

        int ans = 0;

        for(int i : A){

            ans = ans ^ i;
        }

        int lastBit = (ans & (ans - 1)) ^ ans;

        int valueA = 0, valueB = 0;

        for(int i : A){

            if((i & lastBit) != 0){

                valueA = valueA ^ i;

            }else{

                valueB = valueB ^ i;
            }
        }

        int min = Math.min(valueA, valueB), max = Math.max(valueA, valueB);

        int[] arr = new int[2];
        arr[0] = min;
        arr[1] = max;

        return arr;
    }
}
