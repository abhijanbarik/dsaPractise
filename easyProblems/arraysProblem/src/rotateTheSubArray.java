import java.util.*;
public class rotateTheSubArray {
    public static void main(String[] args) {

        int[] arr = new int[]{-3, 4, 2, 8, 7, 9, 6, 2, 10};

        int startIndex = 3, endIndex = 7;

        System.out.println(Arrays.toString(subRotate(arr, startIndex, endIndex)));
    }

    static int[] subRotate(int[] arr, int start, int end){

//      For this approach TC: O(N)  & SC: O(1)
        while(start <= end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; end--;
        }
        return arr;
    }
}
