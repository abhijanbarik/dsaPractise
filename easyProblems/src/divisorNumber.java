import java.util.*;

public class divisorNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        int num = sc.nextInt();


        // Brute force
//        for(int i=1; i <= num; i++) {
//            if (num % i == 0) System.out.println(i);
//        }


        List<Integer> arr = new ArrayList<>();

        // i * i <= n (other way of writing it)
        for(int i = 1; i <= Math.sqrt(num); i++){

            if(num % i == 0) {

                arr.add(i);

                if ((num / i) != i) {

                    arr.add(num/i);
                }
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
