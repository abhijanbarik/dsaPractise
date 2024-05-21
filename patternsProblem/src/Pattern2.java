import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int N = sc.nextInt();

        patternTwo(N);
    }

    public static void patternTwo(int N){

        for(int row = 0; row < N; row++){

            for(int col = 0; col <= row; col++){

                if(col == row) System.out.print("*");

                else System.out.print("* ");
            }

            System.out.println();
        }
    }
}
