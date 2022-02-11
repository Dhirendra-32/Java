package Arrays.Medium;
import Arrays.Easy.PreFixSum;
public class EquilibriumIndex {
    public static boolean checkEqualizer(int []arr, int [] PS){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int Sl;
            int Sr;
            if(i==0){
                Sl = 0;
            }
            else {
                Sl = PS[i-1];
            }
            if(i==(len-1)){
                Sr=0;
            }
            else{
                Sr = PS[len-1]-PS[i];
            }
            if(Sl==Sr){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,6,9,10};
        int[] prefix = PreFixSum.buildPrefix(arr);
        System.out.println(checkEqualizer(arr,prefix));
    }
}
