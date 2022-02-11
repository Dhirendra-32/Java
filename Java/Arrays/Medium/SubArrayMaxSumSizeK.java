/*
*  Problem: Maximum sum subarray having size equal to given K
*  Brute force : TC=> O(N^3) SC :constant
*  Efficient one:TC => O(n-k)+O(k)=>O(N) SC:constant
*
* */
package Arrays.Medium;
public class SubArrayMaxSumSizeK {
    public static int MaxSumSubArraySizeK(int []arr,int n ,int k){
        int j =0;
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        while (j<k){
            currSum=currSum+arr[j];
            j++;
        }
        j=j-1;
        for (int i = 0; i <=n-k; i++) {
            System.out.println(j+" "+i+" "+ (j-i+1));
            if(j-i+1==k){
                maxSum = Math.max(currSum,maxSum);
                /*Similar approach would be for minimum sum subarray of size K */
                j++;
                if(j<=n-1) {
                    currSum = currSum + arr[j] - arr[i];
                }
                else {

                    return maxSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,7,3,8,9,2,4,6};
        int n = arr.length;
        int k = 2;
        System.out.println(MaxSumSubArraySizeK(arr,n,k));
    }
}
