import java.util.*;
public class countFreq {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 10, 5, 5, 11, 10, 11, 11};

        freqCount(arr);
    }

    static void freqCount(int[] arr){

    // Using Hash-Map -> TC: O(N) -> sc: O(N)

    Map<Integer, Integer> hm = new HashMap<>();

        for (int j : arr) {

            if (hm.containsKey(j)) {

                hm.put(j, hm.get(j) + 1);
            } else {

                hm.put(j, 1);
            }
        }

    for(Map.Entry<Integer, Integer> i : hm.entrySet()){

        System.out.println(i.getKey() + " " + i.getValue());
    }



        // Brute Force
//        int n = arr.length;
//       boolean[] res = new boolean[n];
//       for(int i = 0; i < n; i++){
//           if(res[i]) continue;
//           int count = 0;
//           for(int j = 0; j < n; j++){
//               if(arr[i] == arr[j]){
//                   res[j] = true;
//                   count++;
//               }
//           }
//           System.out.println("The frequency of " + arr[i] + " = " + count);
//       }
    }
}
