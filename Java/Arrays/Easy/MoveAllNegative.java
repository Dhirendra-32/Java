package Arrays.Easy;
public class MoveAllNegative {
    public static void setAllNegative(int [] arr,int n){
        int j =0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                if(i!=j){
                    PartitionAlgo.swap(arr,i,j);
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        setAllNegative(arr,n);
        segrigate0And1.PrintArray(arr,n);
    }
}
