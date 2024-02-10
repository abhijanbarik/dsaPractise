import java.util.*;
public class specialIndex {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 3, 2, 7, 6, -2};

        System.out.println(solve(arr));
    }
    
    static int solve(int[] A){

        // TC: O(N) & SC: O(N)

        int count = 0;

        // PreFix-Even
        int[] pfEven = new int[A.length];

        pfEven[0] = A[0];

        for(int i = 1; i < A.length; i++){

            if((i & 1) == 0) pfEven[i] = pfEven[i-1] + A[i];

            else pfEven[i] = pfEven[i-1];
        }

        // PreFix-Odd
        int[] pfOdd = new int[A.length];

        pfOdd[0] = 0;

        for(int i = 1; i < A.length; i++){

            if((i & 1) == 1) pfOdd[i] = pfOdd[i-1] + A[i];

            else pfOdd[i] = pfOdd[i-1];
        }

        int tEven, tOdd, n = A.length;

        for(int i = 0; i < A.length; i++){

            if(i == 0) {

                tEven = pfEven[0];

                tOdd = pfOdd[0];

            } else {

                tEven = pfEven[i-1] + pfOdd[n-1] - pfOdd[i];

                tOdd = pfOdd[i-1] + pfEven[n-1] - pfEven[i];
            }

            if(tEven == tOdd) count++;
        }

        return count;

        /* Optimised Approach */

//      TC -> O(N) and SC -> O(1)

        // int evenSum = 0;
        
        // int oddSum = 0;
        
        // for(int i=0; i<A.length; i++) {
            
        //     if(i%2 == 0)
        //         evenSum += A[i];
            
        //     else
        //         oddSum += A[i];
        // }
        
        // int count = 0;
        
        // for(int i=0;i<A.length; i++) {
           
        //     if(i%2 == 0) {
                
        //         evenSum -= A[i];
                
        //         if(evenSum == oddSum)
        //             count++;
                
        //         oddSum += A[i];
            
        //     } else {
                
        //         oddSum -= A[i];
                
        //         if(evenSum == oddSum)
        //             count++;
                
        //         evenSum += A[i];
        //     }
        // }
        // return count;
    }
}
