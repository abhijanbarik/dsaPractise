public class test {

    public static void main(String[] args) {

        //Testing

        int N = 36, l = 1, cnt = 0;

        int r = N;

        while (l < r){

            int mid = (int) Math.floor((l + r)/2);

            cnt = cnt + 1;

            if((mid * mid) == N) {
                System.out.println(cnt);
                break;
            }

            if((mid * mid) < N) l = mid + 1;

            if((mid * mid) > N) r = mid - 1;
        }
    }
}
