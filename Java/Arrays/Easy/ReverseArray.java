package Arrays.Easy;
/*TC O(N) SC O(N)*/
public class ReverseArray {
    public static void ReverseRec(int[] arr, int i, int j){
        int temp ;
        if(i>=j){
            return;
        }
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        Reverse(arr,i+1,j-1);
    }

    public static void Reverse(int [] arr,int i ,int j){
        int temp;
        while (i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        ReverseRec(arr,0,n-1);
    }
}
