
public class ReverseTheStringWordByWord {

    public static void main(String[] args) {

        String str = "Time the all Motivated Stay";

        System.out.println(solve(str));
    }

    public static String solve(String A){

//        TC: O(N) & SC: O(N) 

        String[] charArr = A.trim().split("\\s+");

        StringBuilder S = new StringBuilder();

        for(int i = charArr.length-1; i >= 0; i--){

            S.append(charArr[i]);

            if(i != 0) S.append(" ");
        }

        return S.toString();
    }
}
