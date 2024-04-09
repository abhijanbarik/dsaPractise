import java.util.*;
import java.lang.*;
import java.io.*;
public class Test {
    public static void main(String[] args) {

        String A = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";

        System.out.println(solve(A));
    }

    static int solve(String A) {

        int count = 0;

        for(int i = 0; i < A.length(); i++){

            if(A.charAt(i) == 'A'){

                for(int j = i; j < A.length(); j++){

                    if(A.charAt(j) == 'G') count++;
                }
            }
        }

        return count;
    }
}

