public class NthMagicNumber {
    public static void main(String[] args) {

        int num = 7;

        int ans = solve(num);

        System.out.println(ans);
    }

    public static int solve(int A){

        // TC: O(Log2(N)) & SC: O(1)

        int res = 0, power = 5;

        while(A > 0){

            int rem = A % 2;

            A = A / 2;

            res = res + (rem * power);

            power = power * 5;
        }

        return res;
    }
}
