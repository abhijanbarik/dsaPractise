package EasyProblems;
import java.util.*;
public class FirstRepeatingElement {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 5, 3, 4, 3, 5, 6};

        int ans = solve(arr);

        System.out.println(ans);
    }

    public static int solve(int[] A){

//        TC: O(N) & SC: O(N) 

        int N = A.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : A){

            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(int i = 0; i < N ; i++){

            if(hm.get(A[i]) > 1) return A[i];
        }

        return -1;
    }
}
