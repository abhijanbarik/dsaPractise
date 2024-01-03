import java.util.*;
public class armStrongNumber {

    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean getRes = armStrong(n);

        System.out.println(getRes);
    }

    public static boolean armStrong(int n){

        int sum = 0, duplicate = n, count = countNum(n);

        //Counting number shortcut
        /*
        * String str = Interger.toString(n);
        * int count = str.length();
        * */

        while(duplicate > 0){

            int rem = duplicate % 10;

            sum = sum + (int)(Math.pow(rem, count));

            duplicate = duplicate / 10;
        }

        return n == sum;
    }

    public static int countNum(int n){
        int cnt = 0;
        while(n > 0){
            n = n / 10;
            cnt = cnt + 1;
        }
        return cnt;
    }

}
