public class GCD {
    public static void main(String[] args){

        int num1 = 15, num2 = 10;

        int getRes = gcd(num1, num2);

        System.out.println(getRes);
    }

    public static int gcd(int a, int b){

        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
