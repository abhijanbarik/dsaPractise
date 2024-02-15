public class ChristmasTreeProblem {
    public static void main(String[] args) {


        int[] A = new int[]{1, 6, 4, 2, 6, 9};

        int[] B = new int[]{2, 5, 7, 3, 2, 7};

        System.out.println(solution(A, B));
    }

    static int solution(int[] A, int[] B){

        int minAnswer = Integer.MAX_VALUE;

        for(int i = 0; i < A.length; i++){

            int minLeft = Integer.MAX_VALUE;

            for(int l = 0; l < i; l++){

                if(A[l] < A[i]){

                    minLeft = Math.min(minLeft, B[l] + B[i]);
                }
            }

            for(int r = i+1; r < A.length; r++){

                if(A[i] < A[r] && minLeft != Integer.MAX_VALUE){

                    minAnswer = Math.min(minAnswer, minLeft + B[r]);
                }
            }
        }

        if(minAnswer == Integer.MAX_VALUE) return -1;

        return minAnswer;
    }
}
