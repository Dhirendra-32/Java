package Arrays.Easy;

public class MaxElement {
    /*based on array size TC:O(N) SC:O(N) */
    public static int findMaximum(int []arr, int n){
        if(n==1){
            return arr[0]; /*if length  is one then that element will be minimum or max*/
        }
        else {
            return Math.max(arr[n-1], findMaximum(arr,n-1));
        }
    }
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;
        System.out.println(findMaximum(A,n));
    }

}
