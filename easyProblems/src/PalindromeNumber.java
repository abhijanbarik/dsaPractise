public class PalindromeNumber {

    public static void main(String[] args){

        int num = 0;

        boolean resBack = isPalindrome(num);

        System.out.println(resBack);
    }

    public static boolean isPalindrome(int x) {

        int real = x, num = 0;

        while(x != 0){

            int rem = x % 10;

            x /= 10;

            num = (num * 10) + rem;
        }

        //True & False
        return real == num && real >= 0;
    }
}
