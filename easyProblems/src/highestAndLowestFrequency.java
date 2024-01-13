import java.util.*;
public class highestAndLowestFrequency {

    public static void main(String[] args) {

        int[] arr = new int[]{10,5,10,15,10,5};

        maxAndMin(arr);
    }

    static void maxAndMin(int[] arr){

    // TC -> O(N) and SC - > 0(N)
    int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE, maxEle = 0, minEle = 0;

    Map<Integer, Integer> hm = new HashMap<>();

    for(int i : arr){

        if(hm.containsKey(i)){

            hm.put(i, hm.get(i) + 1);

        }else{

            hm.put(i, 1);

        }
    }

        for(Map.Entry<Integer, Integer> i : hm.entrySet()){
            int count = i.getValue();
            int element = i.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("Maximum Element: " + maxEle + ", " + "Minimum Element: " + minEle);

        // Brute Force

//        int n = arr.length, maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE, maxEle = 0, minEle = 0;
//
//        boolean[] res = new boolean[n];
//
//        for(int i = 0; i < n; i++){
//
//            int count = 0;
//
//            if(res[i]) continue;
//
//            for(int j = 0; j < n; j++){
//
//                if(arr[i] == arr[j]){
//
//                    count++;
//
//                    res[j] = true;
//                }
//            }
//
//            if(count > maxFreq){
//                maxEle = arr[i];
//                maxFreq = count;
//            }
//
//            if(count < minFreq){
//                minEle = arr[i];
//                minFreq = count;
//            }
//        }
//
//        System.out.println("Maximum Element: " + maxEle + ", " + "Minimum Element: " + minEle);
    }
}
