import java.util.*;
public class NumberOf1Bits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Random Number: ");

        int num = sc.nextInt();

        System.out.println(countBits(num));
    }

    static int countBits(int num) {

         // Optimised Way TC -> O(Log(N)) & SC -> O(1)

        int count = 0;

        while(num > 0){
            num = num & (num - 1);
            count++;
        }

        return count;


//        TC: O(N) & SC: O(1) -> To solve this Brute Force problem we need ArrayList.
//        int count = 0;
//        while((num > 0) && (num > 1)){
//            int rem = num % 2;
//            num = num / 2;
//            arr.add(rem);
//        }
//        for(int i : arr) if(arr.contains(1)) count++;
//        if(count == 0) count = 1;
//        return count;
    }
}
