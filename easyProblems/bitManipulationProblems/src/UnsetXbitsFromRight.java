import java.util.Scanner;
public class UnsetXbitsFromRight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter unset bits: ");
        int unSet = sc.nextInt();
        System.out.println(unSetBits(num, unSet));
    }

    static int unSetBits(int A, int B){

        for(int i = 0; i < B; i++){

            if((A & (1 << i)) != 0){

                A = A ^ (1 << i);
            }
        }
        return A;
    }
}
