import java.util.*;
public class fibNum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int res = fib(num);
        System.out.println(res);
    }

    static int fib(int n){

        if(n <= 1) return n;

        return fib(n-1) + fib(n-2);
    }
}
