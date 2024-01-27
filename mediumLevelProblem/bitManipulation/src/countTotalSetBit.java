import java.util.*;
public class countTotalSetBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        int num = sc.nextInt();
        System.out.println(countSetBit(num));
    }
    static int countSetBit(int num) {


        long N = num + 1, mod = 100000007;

        long ans = 0, pow2 = 1;

        for(int i = 0; i < 32; i++) {

            ans += ((N / (pow2 << 1)) * pow2)%mod + Math.max(0, N % (pow2 << 1) - pow2);

            ans %= mod;

            pow2 <<= 1;
        }

        return (int)ans;








//        Brute-Force will give TLE
//        int res = 0;
//        for(int i = 1; i <= num; i++){
//            res = res + setCount(i);
//        }
//        return res%1000000007;
    }

//    static int setCount(int n){
//        int cnt = 0;
//        while(n > 0){
//            n = n & (n-1);
//            cnt++;
//        }
//        return cnt;
//    }
}
