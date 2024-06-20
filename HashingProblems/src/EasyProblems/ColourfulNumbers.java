package EasyProblems;
import java.util.*;
public class ColourfulNumbers {
    public static void main(String[] args) {

        int num = 3245;

        boolean ans = solve(num);

        System.out.println(ans);
    }
    public static boolean solve(int A){

        // TC: O(N) & SC: O(N) 

        ArrayList<Integer> arr = new ArrayList<>();

        while(A > 0){

            arr.add(A % 10);

            A = A / 10;
        }

        int N = arr.size();

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < N; i++){

            int mul = 1;

            for(int j = i; j < N; j++){

                mul = mul * arr.get(j);

                if(hs.contains(mul)) return false;

                else hs.add(mul);
            }
        }

        return true;
    }
}
