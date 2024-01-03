public class GCD {
    public static void main(String[] args){

        int num1 = 10, num2 = 52;

        int getRes = gcd(num1, num2);

        System.out.println(getRes);
    }

    public static int gcd(int a, int b){
        //Recursive approach
        if(b == 0) return a;
        return gcd(b, a%b);
    }

//    public static int gcd(int a, int b){
//
//        // Euclidean algorithm for GCD
//
//        while(a > 0 && b > 0){
//
//            if(a > b) a = a % b;
//
//            else b = b % a;
//        }
//
//        if (a == 0) return b;
//
//        return a;
//    }
}
