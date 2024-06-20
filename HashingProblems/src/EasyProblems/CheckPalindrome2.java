package EasyProblems;
import java.util.HashSet;
public class CheckPalindrome2 {
    public static void main(String[] args) {

        String s = "aaaabbcc";

        boolean res = solve(s);

        System.out.println(res);
    }

    public static boolean solve(String A){

//         TC: O(N) & SC: O(N) 
        int N = A.length();

        HashSet<Character> hs = new HashSet<>();

        for(int i = 0; i < N; i++){

            if(hs.contains(A.charAt(i))){

                hs.remove(A.charAt(i));

            }else{

                hs.add(A.charAt(i));
            }
        }

        if(hs.size() <= 1) return true;

        return false;

//        /* Optimise Approach*/
//
//        // TC: O(N) & SC: O(1)
//
//        int[] freqArr = new int[26];
//
//        for(int i = 0; i < N; i++){
//
//            freqArr[A.charAt(i) - 'a'] += 1;
//        }
//
//        int cal = 0;
//
//        for(int i = 0; i < freqArr.length; i++){
//
//            cal = cal + freqArr[i] % 2;
//        }
//
//        if(cal <= 1) return true;
//
//        return false;

//
     }
}
