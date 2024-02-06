public class SpecialSubsequencesAG {
    public static void main(String[] args) {

        String s = "BAAGDCAGAGGUIBXAGXUAIAG";

        System.out.println(carryForward(s));
    }

    static int carryForward(String S){

        int count = 0, result = 0;

        for(int i = S.length()-1; i >= 0; i--){

            if(S.charAt(i) == 'G'){

                count++;

            }else if(S.charAt(i) == 'A'){

                result = result + count;
            }
        }

        return result;
    }
}
