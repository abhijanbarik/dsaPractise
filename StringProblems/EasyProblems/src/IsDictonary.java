
public class IsDictonary {

    public static void main(String[] args) {

        String[] arr = new String[]{"Hello", "School", "Invite"};  //{"fine","none","no"}

        String B = "adhbcfegskjlponmirqtxwuvzy";                   // "qwertyuiopasdfghjklzxcvbnm"

        boolean res = solve(arr, B);

        System.out.println(res);
    }
    public static boolean solve(String[] A, String B){

        // TC: O(N) & SC: O(1) 

        int N = A.length;

        for(int i = 0; i < N-1; i++){

            int idxOne = B.indexOf(A[i].charAt(0));

            int idxTwo = B.indexOf(A[i+1].charAt(0));

            if(idxOne > idxTwo || idxOne == idxTwo && A[i].length() > A[i+1].length()) return false;
        }

        return true;
    }
}
