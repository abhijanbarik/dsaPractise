import java.util.*;
public class printRecNto1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        printNum(num, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void printNum(int n, int[] arr){

        if(n <= 0) return;

        printNum(n-1, arr);

        arr[arr.length - n] = n;
    }
}
