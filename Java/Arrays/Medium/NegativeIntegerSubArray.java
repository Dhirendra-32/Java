package Arrays.Medium;
import java.util.Queue;
import java.util.LinkedList;

public class NegativeIntegerSubArray {
    public static void findNegativeIntegerSubarray(int []arr,int n,int k){
        Queue<Integer> list = new LinkedList<>();
        int i;
        for ( i = 0; i < k; i++) {
            //O(K)
            if(arr[i]<0){
                list.add(arr[i]);
            }
        }

        for (; i <n ; i++) {

            if(list.isEmpty()){
                System.out.println("0");
            }
            else
                System.out.print("0" + " ");


        }

    }

    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;
        findNegativeIntegerSubarray(arr,n,k);
    }
}
