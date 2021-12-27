/*
* Idea : Partitioned algorithm(PA),after one round of pivot get correct position and array split
* once we get pivot position we would know weather kth smallest element is in right sub-array or left
* sub-array
* TC: Avg case :
*
* */
package Arrays.Easy;
import java.util.Scanner;
public class KthSmallest {
    public static  int FindKthSmallest(int [] arr,int i,int j,int k){
            int pivot_pos = PartitionAlgo.PartitionRule(arr, i, j);
            if (pivot_pos ==k-1) {
                return arr[pivot_pos];
            }
            if (pivot_pos> k ) {
                return FindKthSmallest(arr, i, pivot_pos - 1, k);
            }
            return FindKthSmallest(arr, pivot_pos + 1, j, k);
    }
    public static void main(String[] args) {
        int[] A = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        System.out.println(FindKthSmallest(A,0,n-1,k));
    }
}
