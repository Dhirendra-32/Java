package Arrays.Easy.SubArray;
public class SumSubarray {
    public static void findSumSubArray(int arr[] ,int n,int p){

        for (int i = 0; i <n; i++) {
            int total_sum=0;
            int count = 0 ;
            for (int j = i; j < n; j++) {
                total_sum=total_sum+arr[j];
                count++;        
                System.out.print(total_sum +" ");
            }
            System.out.print("Count->"+count);
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        findSumSubArray(arr,n,sum);
    }
}
