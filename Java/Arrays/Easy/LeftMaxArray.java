package Arrays.Easy;
/*similar way left Min array can be created */
public class LeftMaxArray {
    public static int [] Solution(int []arr){

        int [] Lmax = new int[arr.length];

        /*Taking first element  of arr as first element of Lmaxarray, becox extreme left element would be max, there is no element behind the extreme left   */
        Lmax [0] = arr[0];


        /*for finding another element of Lmax  we will be using previous Lmax value, because we already know first Lmax element this 1 to n-1 */

        for (int i = 1; i < arr.length; i++) {
            Lmax[i] = Math.max(arr[i],Lmax[i-1]);
        }
        return Lmax;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,-3,4,8,-1,1,5,9};
        int [] Lmax = Solution(arr);
        QuickSort.printArray(Lmax,Lmax.length);
    }
}
