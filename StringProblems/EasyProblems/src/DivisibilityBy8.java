
public class DivisibilityBy8 {

    public static void main(String[] args) {

        String str = "83416";

        int ans = solve(str);

        System.out.println(ans);
    }

    public static int solve(String A){

        // TC: O(N) & SC: O(1)

        int N = A.length();

        int ans = 0;

        if(N <= 3){

            for(int i = 0; i < N; i++){

                ans = ans * 10 + A.charAt(i);
            }

        } else {

            ans = A.charAt(N-3) * 100 + A.charAt(N-2) * 10 + A.charAt(N-1);

        }

        if(ans % 8 == 0) return 1;

        return 0;
    }
}
