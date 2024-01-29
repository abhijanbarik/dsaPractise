import java.util.*;
public class rotateTheArray {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 1, 4, 6, 7};

        System.out.println(Arrays.toString(rotate(arr)));
    }

    static int[] rotate(int[] arr){

//      Optimised TC->O(N) & SC->O(1)
        int i = 0, j = arr.length-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        return arr;
    }
}
