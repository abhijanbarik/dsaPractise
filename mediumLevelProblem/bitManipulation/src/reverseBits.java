import java.util.*;
public class reverseBits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        long num = sc.nextLong();
        System.out.println(returnBit(num));
    }

    public static long returnBit(long A) {

        // Advance level is not as good as brute force TC: O(1) & SC: O(1)
        
        long rev = 0;

        for(int i = 0; i < 32; i++) {

            rev = rev << 1;

            if((A & (1 << i)) != 0)

                rev = rev | 1;

        }

        return rev;




        // Brute Force TC: O(1) & SC: O(1)
        
//        if (A == 0) return A;
//        long[] arr = new long[32];
//        for (int i = 0; i < 32; i++) {
//            if ((A >> i & 1) == 1) {
//                arr[i] = 1;
//            } else {
//                arr[i] = 0;
//            }
//        }
//        long ans = 0;
//        for (int i = 31; i >= 0; i--) {
//            ans = ans + (arr[i] << (31 - i));
//        }
//        return ans;
    }

}
