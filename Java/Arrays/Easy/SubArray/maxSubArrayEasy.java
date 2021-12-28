/*
* You are given an non neg integer array arr of size length.
* Now you need to find a subarray (contiguous elements)
* so that the sum of contiguous elements is maximum.
But the sum must not exceed B.
*/
package Arrays.Easy.SubArray;
public class maxSubArrayEasy {
    public static int maxSubarray(int []arr,int B){
        int sum;
        int trackMax=0;
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = i; j < arr.length; j++) {
                sum=sum+arr[j];
                if(sum<=B){
                    trackMax=Math.max(sum,trackMax);
                }
                if(trackMax>ans){
                    ans = trackMax;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2};
        int B = 1;
        System.out.println(maxSubarray(arr,B));

    }
}
