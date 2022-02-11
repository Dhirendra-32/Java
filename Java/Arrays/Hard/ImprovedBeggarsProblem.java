package Arrays.Hard;
import Arrays.Easy.PreFixSum;
import Arrays.Easy.QuickSort;

public class ImprovedBeggarsProblem {
    public static int [] solution(int []arr,int [][] query) {
        /* iterating q queries just to update given array with specified index */
        for (int row = 0; row < query.length; row++) {
            arr[query[row][0]] += query[row][1];
        }
        return PreFixSum.buildPrefix(arr);  //TC : O(N+Q)
    }
    public static void main(String[] args) {
        int []arr = new int[]{0,0,0,0,0,0,0};
        int [][] query ={{1,3},{4,2},{2,1}};
        int [] brr = solution(arr,query);
        QuickSort.printArray(brr,brr.length);
    }
}
