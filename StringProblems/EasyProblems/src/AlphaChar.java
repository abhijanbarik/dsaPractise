
public class AlphaChar {

    public static void main(String[] args) {

        char[] arr = new char[]{'S', 'c', 'a', 'l', 'e', 'r'};

        boolean ans = solve(arr);

        System.out.println(ans);
    }

    public static boolean solve(char[] A){

        // TC: O(N) & SC: O(1)

        int N = A.length;

        for(int i = 0; i < N; i++){

            if((A[i] < 65 || A[i] > 90) && (A[i] < 97 || A[i] > 122)) return false;
        }

        return true;
    }
}
