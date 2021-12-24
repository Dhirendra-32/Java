package Arrays.Medium;
import java.util.ArrayList;
public class AlternatingArray_bf {
    public static int[] FindAlternateElement(int[] arr, int K) {
        int j ;
        int mid;
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i <= (arr.length-K); i++){
            j = i+K-1;
            if(CheckAlterNate(arr,i,j)){
                mid = (i+j)/2;
                ints.add(mid);
            }
        }
        return convertIntegers(ints);
    }
    public static  boolean CheckAlterNate(int []A,int i, int j){
        for (int k = i; k <j ; k++) {
            if (A[k] == A[k+1]) {
                System.out.println("testing"+A[i]);
                return false;
            }
        }
        return true;
    }
    public static int[] convertIntegers(ArrayList<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i);
        }
        return ret;
    }
    public static void main(String[] args) {
        int [] arr = {1, 0, 1, 0, 1};
        int K = 2 +1;
        int [] brr=FindAlternateElement(arr,K);

        for (int i = 0 ;i<brr.length;i++){

            System.out.println(brr[i]);
        }
    }
}
