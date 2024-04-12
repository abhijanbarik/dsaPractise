import java.util.*;
public class AlternatingSubarray {

    public static void main(String[] args){

        int[] arr = new int[]{1, 0, 1, 0, 1};

        int B = 1;

        int[] ans = solve(arr, B);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[] A, int B) {

        // TC: O(N * B) & SC O(N)

        ArrayList<Integer> ans = new ArrayList<>();

        int n = A.length, len = (2 * B) + 1;

        for(int i = 0; i < (n - len) + 1; i++){

            int curr = -1;

            int flag = 1;

            for(int j = i; j < (i + len); j++){

                if(A[j] == curr){

                    flag = 0;

                    break;
                }

                curr = A[j];
            }

            if(flag == 1){

                ans.add(i + B);
            }
        }

        int[] resArr = new int[ans.size()];

        for(int i = 0; i < resArr.length; i++){

            resArr[i] = ans.get(i);
        }

        return resArr;
    }

}
