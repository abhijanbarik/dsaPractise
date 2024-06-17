package EasyProblems;
import java.util.*;
public class commonElements {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 2, 1};

        int[] arr2 = new int[]{2, 3, 1, 2};

        int[] ans = solve(arr1, arr2);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[] A, int[] B){

        //        TC: O(N + M + K) & SC: O(N + K) 

        int N = A.length, M = B.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < N; i++){

            if(!hm.containsKey(A[i])){                // hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);  {We can write in one-line also.}

                hm.put(A[i], 1);

            }else{

                hm.put(A[i], hm.get(A[i]) + 1);
            }
        }

       ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < M; i++){

            if(hm.containsKey(B[i]) && hm.get(B[i]) > 0){

                arr.add(B[i]);

                hm.put(B[i], hm.get(B[i]) - 1);
            }
        }

        int[] ans = new int[arr.size()];

        for(int i = 0; i < ans.length; i++){

            ans[i] = arr.get(i);
        }

        return ans;
    }
}
