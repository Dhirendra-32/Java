package Arrays.Medium;
import Arrays.Easy.segrigate0And1;
import Arrays.Easy.PartitionAlgo;
public class DutchNationalFlag {
    public static void dutchNationalFlag(int [] arr,int i , int j ){
        int mid = 0;
        while (mid<=j){
            if(arr[mid]==2){
                PartitionAlgo.swap(arr,mid,j);
                j = j-1;
            }
            if(arr[mid]==0){
                PartitionAlgo.swap(arr,i,mid);
                i++;
                mid++;
            }
            if(arr[mid]==1){
                mid++;
            }

        }
    }
    public static void main(String[] args) {
        int [] arr = {2,2,2,2,0};
        int n = arr.length;
        dutchNationalFlag(arr,0,n-1);
        segrigate0And1.PrintArray(arr,n);

    }
}
