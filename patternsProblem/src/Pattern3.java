import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int N = sc.nextInt();

        patternThree(N);
    }

    public static void patternThree(int N){

        for(int row = 0; row < N; row++){

            int val = 1;

            for(int col = 0; col <= row; col++){

                System.out.print(val + " ");

                val++;
            }

            System.out.println();
        }
    }
}
