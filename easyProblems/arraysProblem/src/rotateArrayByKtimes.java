import java.util.*;
public class rotateArrayByKtimes {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 1, 6, 9, 2, 14, 7, 8, 3};

        int k = 4;

        System.out.println(Arrays.toString(kRotation(arr, k)));
    }

    static int[] kRotation(int[] arr, int k){

//        This is optimal solution keeping edge cases in mind.
//        TC: O(N) & SC: O(1)

        int n = arr.length;

        if(k > n) k = k % n;

        int start = 0, end = n-1;

        countRotation(arr, start, end);

        countRotation(arr, 0, k-1);

        countRotation(arr, k, n-1);

        return arr;
    }

    static void countRotation(int[] arr, int start, int end){

        while(start <= end){

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++; end--;
        }
    }
}
