import java.util.Scanner;
public class Pattern7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int N = sc.nextInt();

        patternSeven(N);
    }

    public static void patternSeven(int N){

        for(int row = 0; row < N; row++){

            int space = N - (row + 1);

            for(int S = 0; S < space; S++){

                System.out.print(" ");
            }

            for(int col = 0; col < (2 * row) + 1; col++){


                System.out.print("*");
            }

            for(int S1 = 0; S1 < space; S1++){

                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
