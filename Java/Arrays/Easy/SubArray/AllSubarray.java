/*
*  Program to find out all possible subarray of given array
*  TC :O(N^3) SC: Constant
*  Improvement possibility : NO ,It can't be done below O(N^3)
*
*/
package Arrays.Easy.SubArray;
public class AllSubarray {
    public static void PrintAllSubArray(int []arr,int n){
        for (int k = 0; k < n; k++) {
            for (int l = k; l < n ; l++) {
                for (int m = k; m <=l; m++) {
                    System.out.print(arr[m]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        PrintAllSubArray(arr,n);
    }
}
