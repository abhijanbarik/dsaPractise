public class LongestConsecutiveOne {

    public static void main(String[] args) {
        String A = "111011101";
        System.out.println(solve(A));
    }

    public static int solve(String A) {

        int N = A.length();
        int countOne = 0;
        int maxOnes = 0;
        int leftOnes = 0;
        int rightOnes = 0;

        for (int i = 0; i < N; i++) {

            if (A.charAt(i) == '1') {

                countOne++;

                rightOnes++;

            } else {

                maxOnes = Math.max(maxOnes, leftOnes + rightOnes + 1);

                leftOnes = rightOnes;

                rightOnes = 0;
            }
        }

        maxOnes = Math.max(maxOnes, leftOnes + rightOnes + 1);

        return Math.min(countOne, maxOnes);
    }
}
