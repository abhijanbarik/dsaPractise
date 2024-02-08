public class GoodSubarrays {
    public static void main(String[] args) {

        int[] arr = new int[]{13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};

        int B = 65;

        System.out.println(solve(arr, B));
    }

    static int solve(int[] A, int B) {

        int count = 0;

        for(int i = 0; i < A.length; i++){

            int sum = 0;

            for(int j = i; j < A.length; j++){

                sum = sum + A[j];

                int length = j - i + 1;

                if(((length & 1) == 0) && sum < B || ((length & 1) == 1) && sum > B){

                    count++;
                }
            }
        }
        return count;
    }
}
