package Arrays.Easy.SubArray;
public class AllSubarray {
    public static void PrintAllSubArray(int []arr,int n){
        /*
         *  Program to find out all possible subarray of given array
         *  TC :O(N^3) SC: Constant
         *  Improvement possibility : NO ,It can't be done below O(N^3)
         */
        for (int k = 0; k < n; k++) {
            for (int l = k; l < n ; l++) {
                for (int m = k; m <=l; m++) {
                    System.out.print(arr[m]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void sumAllSubArray(int []arr,int n){
        /*
         *  Program to find out all possible subarray of given array
         *  TC :O(N^3) SC: Constant
         *  Improvement possibility : Yes, It can be done in N^2 using prefix sum but space would o(N)
         */
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                int sum = 0;
                int k;
                for ( k = i; k <=j; k++) {
                    sum = sum+arr[k];
                }
                System.out.println("Index "+(i)+" to "+ (j) +" SUM => "+sum);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4 };
        int n = arr.length;
        //PrintAllSubArray(arr,n);
        sumAllSubArray(arr,n);
    }
}
