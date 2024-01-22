import java.util.*;
public class EvenAndOddNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Random Number: ");
        int num = sc.nextInt();
        if(ans(num)){
            System.out.println("It's Even Number");
        }else{
            System.out.println("It's Odd Number");
        }
    }
    static boolean ans(int num) {
        return (num & 1) == 0;
    }
}
