import java.util.*;
public class countGreaterElements {

//    Given N-array elements, count number of elements having at-least 1 element, greater than itself.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int lengthOfArray = sc.nextInt();

        int[] arr = new int[lengthOfArray];

        for(int i = 0; i < lengthOfArray; i++){
            System.out.println("Enter the " + i + " element of array.");
            arr[i] = sc.nextInt();
        }

        System.out.println(countMax(arr, lengthOfArray));
    }

    static int countMax(int[] arr, int n){

        int maxVal = Integer.MIN_VALUE, count = 0;

        for(int i : arr){
            if(maxVal < i) maxVal = i;
        }

        for(int i : arr) if(maxVal == i) count++;

        return n - count;
    }
}
