import java.util.*;
public class ChangeCharacter {

    public static void main(String[] args) {

        String str = "abcabbccd";

        int B = 3;

        int ans = solve(str, B);

        System.out.println(ans);
    }

    public static int solve(String A, int B){

        // TC: O(N) & SC: O(1)

        int N = A.length();

        int[] arr = new int[26];

        for(int i = 0; i < N; i++){

            int x = A.charAt(i) - 97;

            arr[x]++;
        }

        Arrays.sort(arr);

        int sum = 0;

        for(int i = 0; i < 26; i++){

            sum = sum + arr[i];

            if(sum > B) return 26 - i;
        }

        return -1;
    }
}
