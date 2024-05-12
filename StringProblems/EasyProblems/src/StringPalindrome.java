public class StringPalindrome {

    public static void main(String[] args) {


        String s = "malayalam";

        String ans = solve(s);

        System.out.println(ans);
    }

    public static String solve(String A){

//        TC: O(N) & O(1)

        int N = A.length();

        for(int i = 0; i <= N/2; i++){

            char start = A.charAt(i);

            char end = A.charAt(N-1-i);

            if(start != end) return "False";
        }

        return "True";

//        StringBuilder S = new StringBuilder(A).reverse();
//
//        if(A.equals(S.toString())) return "True";
//
//        return "False";
    }

}
