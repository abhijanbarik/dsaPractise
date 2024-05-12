import java.util.*;
public class ClosestMinMax {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 1, 3, 4, 6, 4, 6, 3};

        System.out.println(rangeValue(arr));
    }

    static int rangeValue(int[] A){

        // TC: O(N) & SC: O(1)

        int maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE, minIndex = -1, maxIndex = -1, N = A.length;

        int ans = N;

        for(int i = 0; i < N; i++){

            maxValue = Math.max(A[i], maxValue);

            minValue = Math.min(A[i], minValue);
        }

        if(minValue == maxValue) return 1;

        for(int i = N-1; i >= 0; i--){

            if(A[i] == maxValue){

                maxIndex = i;

                if(minIndex != -1){

                    int len = minIndex - maxIndex + 1;

                    ans = Math.min(len, ans);
                }
            }else if(A[i] == minValue){

                minIndex = i;

                if(maxIndex != -1){

                    int len = maxIndex - minIndex + 1;

                    ans = Math.min(len, ans);
                }
            }
        }

        return ans;
    }
}
