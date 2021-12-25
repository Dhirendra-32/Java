/*Find Peak Element
A peak element is an element that is greater than its neighbors.
Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
You may imagine that nums[-1] = nums[n] = -∞.
Input: [1, 2, 3, 1]
Output: 2
Output explanation: 3 is a peak element and your function should return the index number 2.
Input: [1, 2, 1, 3, 5, 6, 4]
Output: 1 or 5
Output explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
=========================================
basic method  (more description in the code).
<<<<<<< HEAD
    Time Complexity:    O(N)
=======
    Time Complexity:    O(LogN)
>>>>>>> 1def06003e3252c67cf31f3e73beaeb5b4a45ae0
    Space Complexity:   O(1)*/

package Arrays.Easy;
public class PeakElement {
    public static int findPeakElement(int []arr,int n){
        //always check corner case of element , here first and last element
        if (n==1){                  /* if only one element then it will always be ,Peak element*/
            return 0;
        }
        if(arr[0]>arr[1]){
            return  0;
        }
        if(arr[n-1]>arr[n-2]){
            return n-1;
        }

        for (int i = 1; i < n-1; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        System.out.println(findPeakElement(arr,n));
    }
}
