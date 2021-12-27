package Arrays.Easy;
public class MoveAllNegativeOneSide {
    public static void MoveAllNegativeLeftSide(int [] arr,int i , int j){
        while (i<j){
            if(arr[i]<0){
                i++;
            }
            else if(arr[i]>=0 && 0<=arr[j]){
                j--;
            }
            else{
                PartitionAlgo.swap(arr,i,j);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        MoveAllNegativeLeftSide(arr,0,n-1);
        segrigate0And1.PrintArray(arr,n);
    }
}
