package Arrays.Easy;
public class MaxSumKCornerElement {
    public static int solution(int [] arr,int b){
        /*first find sum of all k element from front needed loop b-1 index */
        int cur_sum = 0;
        int max_sum = 0;
        for (int i = 0; i < b; i++) {
            cur_sum +=arr[i];
        }
        /*till now max sum will be equal to curr sum for firs b element*/
        max_sum = cur_sum;
        /*now sliding window will be used to consider element from right end side but we need the
        * index of last corner element
        */
        int j = arr.length-1;
        for (int i = b-1; i >=0; i--) {
            cur_sum = cur_sum-arr[i]+arr[j];
            max_sum = Math.max(max_sum,cur_sum);
            j--;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{ 1, 2};
        int B = 1;
        System.out.println(solution(arr,B));
    }
}
