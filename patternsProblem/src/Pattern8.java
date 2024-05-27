import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int N = sc.nextInt();

        patternEight(N);

    }

    public static void patternEight(int N){ 

        for(int row = 0; row < N; row++){

            for(int sp1 = 0; sp1 < row; sp1++){

                System.out.print(" ");
            }

            for(int col = 0; col < (2 * N) - (2 * row + 1); col++){

                System.out.print("*");
            }

            for(int sp2 = 0; sp2 < row; sp2++){

                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
