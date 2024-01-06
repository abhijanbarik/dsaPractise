import java.util.*;
public class reverseArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Enter the " + i + " index-element: ");
            int num = sc.nextInt();
            arr[i] = num;
        }
        int[] ans = revArray(size, arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] revArray(int n, int[] nums){

        for(int i=0; i < n/2; i++){

            int temp = nums[i];

            nums[i] = nums[n-i-1];

            nums[n-i-1] = temp;
        }

        return nums;
    }
}
