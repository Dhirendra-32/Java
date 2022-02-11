package Arrays.Medium;

public class SumAllSubArray {
    public static long findAllSubArraySum(int []A,int n){
        long num = A.length;
        long ans = 0;
        for(int i = 0 ; i<num; i++){
            ans += (A[i] * (i+1) * (num-i));

        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,7,3,8,9,2,4,6};
        int n = arr.length;
        System.out.println(findAllSubArraySum(arr,n));
    }
}
