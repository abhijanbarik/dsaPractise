public class singleNumber {

    public static void main(String[] args) {

        int[] A = new int[]{2, 3, 5, 2, 5, 2, 12, 11, 16, 11, 12, 16};

        System.out.println(singleDigit(A));
    }

    static int singleDigit(int[] arr){

        // TC: O(N), SC: O(1)

        int res = 0;

        for(int i : arr){

            res = res ^ i;
        }

        return res;
    }
}
