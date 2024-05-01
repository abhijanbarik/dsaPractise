
import java.util.*;
public class MajorityElementTwo {

    public static void main(String[] args) {

        //  N/3 repeated number in an array

        int[] arr = new int[]{4,4,2,4,3,4,3,3,1,3};

        List<Integer> res = majorityElement(arr);

        System.out.println(Arrays.toString(res.toArray()));
    }

    public static List<Integer> majorityElement(int[] A){

//        TC: O(N) & SC: O(1)

        ArrayList<Integer> res = new ArrayList<>();

        int n = A.length;
        
        int count1 = 0, count2 = 0;
        
        int val1 = Integer.MIN_VALUE, val2 = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){

            if(count1 == 0 && val2 != A[i]){

                count1 = 1;

                val1 = A[i];

            } else if(count2 == 0 && val1 != A[i]){

                count2 = 1;

                val2 = A[i];

            }

            else if(val1 == A[i]) count1++;

            else if (val2 == A[i]) count2++;

            else{

                count1--;

                count2--;
            }
        }

        count1 = 0;

        count2 = 0;

        for(int i = 0; i < n; i++){

            if(val1 == A[i]) count1++;

            else if(val2 == A[i]) count2++;
        }

        int maxFreq = (int)(n/3) + 1;

        if(count1 >= maxFreq) res.add(val1);

        if(count2 >= maxFreq) res.add(val2);

        return res;
    }
}


