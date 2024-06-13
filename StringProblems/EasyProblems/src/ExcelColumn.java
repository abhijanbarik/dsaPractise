
public class ExcelColumn {

    public static void main(String[] args) {

        String str = "BB";

        int ans = solve(str);

        System.out.println(ans);
    }

    public static int solve(String A){

        // TC: O(N) & SC: O(1)

        int ans = 0, mul = 1;

        for(int i = A.length() - 1; i >= 0; i--){

            ans = ans + (mul * (A.charAt(i) - 64));

            mul = mul * 26;
        }

        return ans;
    }
}
