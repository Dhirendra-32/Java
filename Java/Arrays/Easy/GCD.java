package Arrays.Easy;

public class GCD {

    public static void main(String[] args) {
        int a = 10 , b = 50 ;
        System.out.println(optimalMethod(a,b));

    }
    public static int bruteForceMethod(int a, int b){
        int result=0;
        for (int i = 1; i <= Math.min(a,b); i++) {

            if (a%i==0 && b%i==0){

                result = i;
            }
        }

        return result;
    }
    public static int optimalMethod (int a,int b){


        if (b ==0){

            return a;
        }

        else{

            return optimalMethod(b,a%b);
        }
    }
}
