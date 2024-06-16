import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {


        int[] arr = new int[]{4, 1, 2, 5, 3};

        int[] res = solve(arr);

        System.out.println(Arrays.toString(res));
    }

    public static int[] solve(int[] A){

        // TC: O(N) & SC: O(1) 

        int N = A.length;

        for (int i = 0; i < N;) {

            int correctIdx = A[i] - 1;

            if (A[i] != A[correctIdx]) {

                swapFun(A, i, correctIdx);

            } else {

                i++;
            }
        }

//        int i = 0;
//
//        while(i < N){
//
//            int correctIdx = A[i] - 1;
//
//            if(A[i] != A[correctIdx]){
//
//                swapFun(A, i, correctIdx);
//
//            } else {
//
//                i++;
//            }
//        }

        return A;
    }

    public static void swapFun(int[] A, int start, int end){

        int temp = A[start];

        A[start] = A[end];

        A[end] = temp;
    }
}
