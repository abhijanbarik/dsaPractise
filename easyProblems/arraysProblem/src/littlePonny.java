public class littlePonny {
    public static void main(String[] args) {

        int[] arr = new int[]{24,33,13,11,30,28,19,8,30,25,42,6,30,49,3,49,24,13,3,50};

        int B = 13;

        System.out.println(countNumber(arr, B));
    }

    static int countNumber(int[] A, int B){

        int count = 0, flag = 0;

        for (int i : A) {

            if (i == B) flag = 1;

            if (i > B) count++;
        }

        if(flag == 1) return count;

        return -1;
    }
}
