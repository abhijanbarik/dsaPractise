package EasyProblems;
import java.util.HashSet;

public class SumArray_With_0_sum {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, -2, 4, -4};

        int ans = solve(arr);

        System.out.println(ans);
    }

    public static int solve(int[] A){

//        TC: O(N) & SC: O(N)
        /* We can also solve this by PreFix-Sum method */

        HashSet<Long> hs = new HashSet<>();

        long sum = 0;

        for(long i : A){

            sum = sum + i;

            if(hs.contains(sum)){

                return 1;

            }else{

                hs.add(i);
            }
        }

        return 0;
    }
}
