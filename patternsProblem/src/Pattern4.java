import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int N = sc.nextInt();

        patternFour(N);
    }

    public static void patternFour(int N){

        for(int row = 0; row < N; row++){

            int val = 1 + row;

            for(int col = 0; col <= row; col++){

                if(col == row) System.out.print(val);

                else System.out.print(val + " ");
            }

            System.out.println();
        }

    }
}
