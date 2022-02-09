package Arrays.Easy;

public class RightMaxArray {
    public static int [] Solution(int []arr){

        int [] Rmax = new int[arr.length];

        /*Taking last  element  of arr as last element  of Rmax array, because extreme left element would be max, there is no element behind the extreme left   */
        Rmax [arr.length-1] = arr[arr.length-1];


        /*for finding another element of Rmax  we will be using previous Rmax value, because we already know first Rmax element this 1 to n-1 */

        for (int i = arr.length-2; i >=0; i--) {
            Rmax[i] = Math.max(arr[i],Rmax[i+1]);
        }
        return Rmax;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,-3,4,8,-1,1,5,9};
        int [] Rmax = Solution(arr);
        QuickSort.printArray(Rmax,Rmax.length);
    }
}
