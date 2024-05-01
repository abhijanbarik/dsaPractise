import java.util.*;
import java.lang.*;
public class LargestNumber {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));

        String ans = largestNumber((ArrayList<Integer>) arr);

        System.out.println(ans);
    }

    public static String largestNumber(ArrayList<Integer> A){

//        TC: O(N(Log(N))) & SC: O(1) 

        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {

                String s1 = Long.toString(a);

                String s2 = Long.toString(b);

                if(Long.parseLong(s1 + s2) < Long.parseLong(s2 + s1)){

                    return 1;

                }else {

                    return -1;
                }
            }
        });

        /*  Edge case  */

        int countZeros = 0;

        for(int i : A){

            if(i == 0) countZeros++;
        }

        if(countZeros == A.size()) return "0";
                                                                            /*  We can also write it like this */
                                                                            //        String ans = "";
                                                                            //
                                                                            //        for(int i : A){
                                                                            //
                                                                            //            ans = ans + i;
                                                                            //        }
        StringBuffer ans = new StringBuffer();

        for(int i : A){

            ans.append(i);
        }

        return ans.toString();
    }
}
