import java.util.*;
public class printName {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> res = (ArrayList<String>) printName(num);
        System.out.println(res);
    }

    static List<String> printName(int n){

        ArrayList<String> str = new ArrayList<>();

        returnAns(n, str);

        return str;
    }

    static List<String> returnAns(int n, List<String> str){
        if(n <= 0) return str;
        returnAns(n-1, str);
        str.add(n + ": My name is Ron ");
        return str;
    }
}
