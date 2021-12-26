/*Here time AVG complexity would O(nlogn) when array partitioned into two equal sub-arrays */
/*T(N) = 2T(N/2)+n which leads to nlogn */
/*Whats would be the worst case - one element in one part and remaining n-1 in another parts O(N^2) and sc: O(N) */
package Arrays.Easy;
public class QuickSort {
    public static int [] QuickSortAlgo(int [] arr,int i ,int j){
        if(i<=j){
            int m = PartitionAlgo.PartitionRule(arr,i,j);
            QuickSortAlgo(arr,i,m-1);
            QuickSortAlgo(arr,m+1,j);
        }
        return arr;
    }
    public static void printArray(int[] arr, int size) {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        int[] p =QuickSortAlgo(arr,0,n-1);
        printArray(p,p.length);

    }
}
