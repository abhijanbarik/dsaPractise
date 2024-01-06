import java.util.*;
public class print1toNwithRecursion {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] res;
        res = recFunc(num, arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] recFunc(int n, int[] arr){

        if(n <= 0) return arr;        // Base condition

        recFunc(n - 1, arr);         // Recursion

        arr[n-1] = n;

        return arr;
    }
}
