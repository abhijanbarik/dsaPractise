import java.util.*;
public class printName {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        ArrayList<String> res = (ArrayList<String>) printNameRec(num);
        System.out.println(res);
    }

    static List<String> printNameRec(int n){

        ArrayList<String> str = new ArrayList<>();

        returnAns(n, str);

        return str;
    }

    static void returnAns(int n, List<String> str){

        if(n <= 0) return;

        returnAns(n-1, str);

        str.add(n + ": My name is Ron ");
    }
}
