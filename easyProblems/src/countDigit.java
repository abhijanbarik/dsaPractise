public class countDigit {

    public static void main(String[] args){

        int N = 2207;

        int getBack = evenlyDivides(N);

        System.out.println(getBack);
    }

    static int evenlyDivides(int N){
        // code here

        int num = N, count = 0;

        while(N > 0){

            int rem = N % 10;

            N = N / 10;

            if(rem > 0 && num % rem == 0) count++;
        }

        return count;
    }
}
