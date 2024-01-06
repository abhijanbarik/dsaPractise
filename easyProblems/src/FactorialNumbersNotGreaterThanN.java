import java.util.*;
public class FactorialNumbersNotGreaterThanN {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();

        List<Long> arr = new ArrayList<>();

        long fact = 1;

        long i = 1;

        factNum(n, fact, i, arr);

        System.out.println(arr);
    }

    static void factNum(long n, long fact, long i, List<Long> arr){

        if(fact > n) return;
        arr.add(fact);
        i++;
        fact = fact * i;
        factNum(n, fact, i, arr);


        /* Using while Loop */
//        while(fact <= n){
//            arr.add(fact);
//            i++;
//            fact *= i;
//        }
    }
}
