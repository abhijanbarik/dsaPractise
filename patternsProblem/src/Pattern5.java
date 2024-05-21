import java.util.Scanner;
public class Pattern5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int N = sc.nextInt();

        patternFive(N);
    }

    public static void patternFive(int N){

        for(int row = 0; row < N; row++){

            for(int col = N-row-1; col >= 0; col--){

                if(col == 0) System.out.print("*");

                else System.out.print("* ");
            }

            System.out.println();
        }
    }
}
