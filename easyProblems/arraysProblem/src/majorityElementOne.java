public class majorityElementOne {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};           // {4,4,2,4,3,4,4,3,2,4}

        int ans = majorEle(arr);

        System.out.println(ans);
    }

    public static int majorEle(int[] A){

        // TC -> O(N) & SC -> O(1)
        // Applying Moore's Voting algo to get the major Element present;

        int count = 0, maxVal = 0, n = A.length;

        for(int i = 0; i < n; i++){

            if(count == 0) maxVal = A[i];

            if(maxVal == A[i]) count++;

            else count--;
        }

        // Check again if the majority value is greater than N/2;
        // This below check is not required, if in question it's mentioned that Majority element always present. 

        int freq = 0;

        for(int i = 0; i < n; i++) if(maxVal == A[i]) freq++;

        if(freq > n/2) return maxVal;

        return -1;
    }
}
