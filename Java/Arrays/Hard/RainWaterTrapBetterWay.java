package Arrays.Hard;
import Arrays.Easy.LeftMaxArray;
import Arrays.Easy.QuickSort;
import Arrays.Easy.RightMaxArray;

public class RainWaterTrapBetterWay {
    public static int Solution(int[] arr){
        int amountWater = 0 ;
        int [] Lmax = LeftMaxArray.Solution(arr); /*Preparing left max array */
        int [] Rmax = RightMaxArray.Solution(arr); /*Preparing right max array */
        QuickSort.printArray(Lmax,Lmax.length);
        QuickSort.printArray(Rmax,Rmax.length);
        /*Looping all the building */
        for (int i = 0; i < arr.length ; i++) {

            amountWater = amountWater + Math.min(Lmax[i],Rmax[i])-arr[i];
        }

        return amountWater;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(Solution(arr));
    }
}
