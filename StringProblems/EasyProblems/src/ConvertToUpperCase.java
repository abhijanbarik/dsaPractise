import java.util.Arrays;

public class ConvertToUpperCase {

    public static void main(String[] args) {

        char[] arr = new char[]{'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '4'};

        char[] ans = solve(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static char[] solve(char[] A){

        int N = A.length;

        for(int i = 0; i < N; i++){

            if(A[i] >= 97 && A[i] <= 122){

                A[i] = (char)(A[i] ^ 32);
            }
        }

        return A;
    }
}
