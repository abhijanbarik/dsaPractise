public class EvenDigitSum {

    public static void main(String[] args){

        int num = 30;

        int getResult = countEven(num);

        System.out.println(getResult);
    }

    public static int countEven(int num) {

        int count = 0;

        for(int i = 2; i <= num; i++){

            int sum=0;
            int temp=i;
            while(temp>0)
            {
                int dig=temp%10;
                sum+=dig;
                temp/=10;
            }
            if (sum%2==0) count++;
        }

        return count;
    }
}
