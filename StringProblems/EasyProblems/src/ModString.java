
public class ModString {
    public static void main(String[] args) {

        String str = "4238964362646491649612961496126912496129794612946921649247267461294862189461289461289412986489126";

        int B = 69;

        int ans = solve(str, B);

        System.out.println(ans);
    }

    public static int solve(String A, int B){

        // TC: O(N) & SC: O(1) 

        long ans = 0, exp = 1;

        for(int i = A.length() - 1; i >= 0; i--){

            ans = ans + exp * (A.charAt(i) - '0') % B;

            ans = ans % B;

            exp = (exp * 10) % B;
        }

        return (int)(ans);
    }
}
