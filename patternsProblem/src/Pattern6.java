import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int N = sc.nextInt();

        patternSix(N);
    }

    public static void patternSix(int N){

        for(int row = 0; row < N; row++){

            int val = 1;

            for(int col = N-row-1; col >= 0; col--){

                if(col == 0) System.out.print(val);

                else System.out.print(val + " ");

                val++;
            }

            System.out.println();
        }
    }
}
