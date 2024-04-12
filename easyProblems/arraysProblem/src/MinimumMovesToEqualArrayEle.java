
public class MinimumMovesToEqualArrayEle {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};

        int ans = minMoves(arr);

        System.out.println(ans);
    }

    static int minMoves(int[] nums) {

        // TC: O(n) & SC: O(1)

        int minValue = Integer.MAX_VALUE, count = 0;

        for (int num : nums) {

            minValue = Math.min(minValue, num);
        }

        for (int num : nums) {

            count = count + (num - minValue);
        }

        return count;
    }
}
