
public class ReverseString {

    public static void main(String[] args) {

        String S = "Google";

        System.out.println(solve(S));
    }

    public static String solve(String A){

//        TC: O(N) & SC: O(N) 

        StringBuilder sb = new StringBuilder(A);

        int start = 0, end = A.length()-1;

        while(start <= end){

            char temp = sb.charAt(start);

            sb.setCharAt(start, A.charAt(end));

            sb.setCharAt(end, temp);

            start++;

            end--;
        }

        return sb.toString();

//        StringBuilder sb = new StringBuilder(A).reverse();
//        return sb.toString();
    }
}
