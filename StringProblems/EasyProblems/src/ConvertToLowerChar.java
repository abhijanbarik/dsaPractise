import java.util.Arrays;

public class ConvertToLowerChar {

    public static void main(String[] args) {

        char[] S = new char[]{'S', 'c', 'A', 'L', 'e', 'R', '#', '2', '0', '2', '4'};

        char ans[] = solve(S);

        System.out.println(Arrays.toString(ans));
    }

    public static char[] solve(char[] A){

        // TC: O(N) & SC: O(1)

        int N = A.length;

        for(int i = 0; i < N; i++){

            if(A[i] >= 65 && A[i] <= 90){

                A[i] = (char)(A[i] ^ 32);
            }
        }

        return A;
    }
}
