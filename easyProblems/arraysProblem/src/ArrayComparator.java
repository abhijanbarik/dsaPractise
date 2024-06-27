import java.util.*;
public class ArrayComparator {
    public static void main(String[] args) {

       List<Integer> arr = Arrays.asList(2, 3, 5, 1, 6, 7, 4, 8, 9, 11, 10, 12);

       // Sort in Ascending Order.
        Collections.sort(arr, new Comparator<Integer>(){

            public int compare(Integer a, Integer b){

                return a - b;                             // Switch to Descending Order by doing return b - a;
            }
        });

        System.out.println(arr);



        // String sorting

        List<String> res = Arrays.asList("Mango", "Banana", "Apple", "Coconut", "Avocado");

        Collections.sort(res, new Comparator<String>(){

            public int compare(String a, String b){

                return a.compareTo(b);                      // Switch to Descending Order by doing return b.compareTo(a);
            }
        });

        System.out.println(res);
    }
}
