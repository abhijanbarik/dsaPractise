public class twoSum {
    public static void main(String[] args) {

        int[] arr = new int[]{3, -2, 1, 4, 3, 6, 6};

        int value = 10;

        if(res(arr, value)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    static boolean res(int[] arr, int k){


//        Brute-Force TC: O(N^2) and SC: O(1)

        int size = arr.length;

        for(int i = 0; i < size-1; i++){

            for(int j = i+1; j < size; j++){

                if(arr[i] + arr[j] == k) return true;
            }
        }

        return false;
    }
}
