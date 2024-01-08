import java.util.*;
public class pattern22 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        patternGame22(num);
    }

    static void patternGame22(int n){

        int numUntil = 2 * n - 1;

        for(int row = 0; row < numUntil; row++){

            for(int col = 0; col < numUntil; col++){

                int atEveryIndex = n - Math.min(Math.min(col, row), Math.min((numUntil-1) - row, (numUntil-1) - col));

                System.out.print(atEveryIndex + " ");
            }

            System.out.println();
        }
    }
}
