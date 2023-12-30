import java.util.*;
public class majorityElement {
    public static void main(String[] args){
        // A[] = [3, 3, 4, 2, 4, 4, 2, 4, 4]
        // A[]= [3, 3, 4, 2, 4, 4, 2, 4, 4]
        //  A[] = [4, 3, 4]

        int A[] = new int []{1, 2, 4, 1, 1};

        int num = majorEle(A);

        System.out.println(num);
    }

    public static int majorEle(int A[]){


        /* Brute-Force */
//        int majorEle = 0, n = A.length;
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                if(A[i] == A[j]) majorEle = majorEle + 1;
//            }
//            if(majorEle > n/2) return A[i];
//        }
//        return 0;


        /* Sorting */
//        Arrays.sort(A);
//        int n = A.length;
//        return A[n/2];

        /* Boyer-Moore Voting Algorithm */

        int count = 0;

        int majorityCandidate = 0;

        for(int i = 0; i < A.length; i++){

            if(count == 0) majorityCandidate = A[i];

            if(majorityCandidate == A[i]) count++;

            else count--;
        }

        return majorityCandidate;
    }
}
