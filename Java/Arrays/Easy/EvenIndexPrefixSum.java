package Arrays.Easy;
public class EvenIndexPrefixSum {
    /*declaring same length array to find prefix even array*/

    public static int [] buildEvenIndexPrefixSum (int []arr){
        int [] PSe = new int[arr.length];
        PSe[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (i%2==0) {
                PSe[i]=PSe[i-1]+arr[i];
            }
            else{
                PSe[i]=PSe[i-1];
            }
        }
        return PSe;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{2,4,3,1,5};
        int [] PSe = buildEvenIndexPrefixSum(arr);
        QuickSort.printArray(PSe, PSe.length);
    }
}
