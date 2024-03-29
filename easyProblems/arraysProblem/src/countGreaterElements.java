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

        // TC -> O(1), SC -> O(1).

        int maxVal = Integer.MIN_VALUE, count = 0;

        // Try in single loop
        for (int i : arr) {

            if (maxVal < i) {

                maxVal = i;

                count = 1;  // Reset count when a new maximum is found

            } else if (maxVal == i) {

                count++;   // Increment count for each occurrence of the current maximum
            }
        }

//        for(int i : arr){
//            if(maxVal < i) maxVal = i;
//        }
//        for(int i : arr) if(maxVal == i) count++;

        return n - count;
    }
}
