package EasyProblems;
import java.util.*;
public class Two_Sum {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 11, 15, 9, 7};

        int B = 9;

        int[] ans = solve(arr, B);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[] A, int target){

//        TC: O(N) & SC: O(N) 

        Map<Integer, Integer> hm = new HashMap<>();

        int N = A.length;

        for(int i = 0; i < N; i++){

            int val = target - A[i];

            if(hm.containsKey(val)){

                return new int[]{hm.get(val) + 1, i+1};

            }else{

                if(hm.containsKey(A[i])) continue;        /* Avoid the repetition, if the element already exist then skip. Else, you will get wrong answer.*/
                hm.put(A[i], i);
            }
        }

        return new int[]{};
    }
}
