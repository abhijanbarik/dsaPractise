import java.util.*;

public class primeNumbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean res = isPrime(num);

        System.out.println(res);
    }

    public static boolean isPrime(int n){

        if(n == 1) return false;

        for(int i = 2; i*i <= n; i++){

            if(n%i == 0) return false;
        }
        return true;
    }
}
