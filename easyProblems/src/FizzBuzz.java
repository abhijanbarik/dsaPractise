import java.util.*;

public class FizzBuzz {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which is greater than 10: ");
        int num = sc.nextInt();
        List<String> arr = new ArrayList<>();
        fizzBuzz(num, arr);
        System.out.println(arr);
    }

    static void fizzBuzz(int n, List<String> arr){

        for(int idx = 1; idx <= n; idx++){
            if(idx % 15 == 0) arr.add("FizzBuzz");
            else if(idx % 3 == 0) arr.add("Fizz");
            else if(idx % 5 == 0) arr.add("Buzz");
            else arr.add(Integer.toString(idx));
        }
    }
}
