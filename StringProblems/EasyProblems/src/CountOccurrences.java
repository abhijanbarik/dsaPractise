
public class CountOccurrences {

    public static void main(String[] args) {

        String  s = "batchbobclassbobobobdancebob";

        int ans = solve(s);

        System.out.println(ans);
    }

    public static int solve(String A){

        // TC: O(N) & SC: O(1)

        int N = A.length(), count = 0;

        for(int i = 0; i < N-2; i++){

            if(A.charAt(i) == 'b' && A.charAt(i+1) == 'o' && A.charAt(i+2) == 'b')
                count++;
        }

        return count;
    }
}
