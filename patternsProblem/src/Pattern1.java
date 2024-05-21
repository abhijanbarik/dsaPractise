import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int N = sc.nextInt();

        patternOne(N);

    }

    public static void patternOne(int N){


        for(int row = 0; row < N; row++){

            for(int col = 0; col < N; col++){

                if(col < N-1){

                    System.out.print("* ");

                }else{

                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
