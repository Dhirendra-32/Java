package Arrays.Easy;
public class OddIndexPrefixSum {
    public static int [] buildOddIndexPrefixSum(int []arr){
        int [] PSo = new int[arr.length];
        PSo[0] = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (i%2==0) {
                PSo[i]=PSo[i-1];
            }
            else{
                PSo[i]=PSo[i-1]+arr[i];
            }
        }
        return PSo;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{2,4,3,1,5};
        int [] PSo = buildOddIndexPrefixSum(arr);
        QuickSort.printArray(PSo, PSo.length);
    }
}
