import java.util.*;
public class stringPalindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        int i = 0;
        boolean res = palString(str, i);
        if(res){
            System.out.println("It's a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }
    }

    static boolean palString(String s, int i){

        if(i >= s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;                // Compare the char1[0] & char2[n-1], then increase char1 and reduce char2 and check. 

        return palString(s, i+1);                                                    //recursively it will increase i
    }
}
