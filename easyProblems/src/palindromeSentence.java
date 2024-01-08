import java.util.*;
import java.lang.*;
//import java.io.*;

public class palindromeSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        boolean str = isPlaindrome(s);
        if(str){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    static boolean isPlaindrome(String s){

        if (s.isEmpty())  return true;

        int start = 0;

        int last = s.length() - 1;

        while(start <= last) {

            char currFirst = s.charAt(start);

            char currLast = s.charAt(last);

            if (!Character.isLetterOrDigit(currFirst )) {

                start++;

            } else if(!Character.isLetterOrDigit(currLast)) {

                last--;

            } else {

                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {

                    return false;
                }

                start++;

                last--;
            }
        }
        return true;
    }
}
