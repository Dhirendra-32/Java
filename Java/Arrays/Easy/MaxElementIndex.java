package Arrays.Easy;

public class MaxElementIndex {
        /*based on array size TC:O(N) SC:O(N) */
        public static int findMaximum(int []arr, int i, int j){
            if(i==j){
                return arr[i]; /*if both index's are same then there will be one element, it would minimum */
            }
            else {
                return  Math.max(arr[i], findMaximum(arr,i+1,j));
            }
        }

        public static void main(String[] args) {
            int[] A = {1, 4, 45, 6, -50, 10, 2};
            int n = A.length;
            System.out.println(findMaximum(A,0,n-1));
        }
}
