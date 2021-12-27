package Arrays.Easy;

public class segrigate0And1 {
    public static void Separate(int [] arr,int len){
        int count_0=0;
        int count_1=0;
        /* traversing just to maintain count of 1's and o's in the array TC --O(N)--*/
        for (int i = 0; i <len ; i++) {
            if(arr[i]==0) {
                count_0++;
            }
            else if(arr[i]==1){
                count_1++;
            }
        }
        /*setting the array with o's and 1's TC O(N)*/
        for (int i = 0; i < len; i++) {
            if(i<count_0){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
    }
    public static void SeparateSecond(int [] arr,int len){
        int leftIndex = 0;
        int rightIndex= len-1;
        while(leftIndex!= rightIndex){
            if (arr[leftIndex]>arr[rightIndex]) {
                PartitionAlgo.swap(arr,leftIndex,rightIndex);
                leftIndex++;
                rightIndex--;
                continue;
            }
            if(arr[leftIndex]==arr[rightIndex] && arr[leftIndex]==0){
                leftIndex++;
                continue;
            }
            if(arr[leftIndex]==arr[rightIndex] && arr[leftIndex]==1){
                rightIndex--;
                continue;
            }
            leftIndex++;
            rightIndex--;
        }
    }
    public static void PrintArray(int []arr,int len){
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {0,0,0,0,0,0,0,0,0,0,0};
        int len = arr.length;
        //Separate(arr,len);
        SeparateSecond(arr,len);
        PrintArray(arr,len);
    }
}
