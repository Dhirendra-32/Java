package Arrays.Easy;

public class PreFixSum {

    public static int [] buildPrefix(int arr[]){
        int [] prefix = new int [arr.length];

        prefix[0]=arr[0];

        for (int i = 1; i < arr.length; i++) {

            prefix[i] = arr[i]+prefix[i-1];
        }

        return prefix ;
    }

    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4,8,10};
        int [] prefix = buildPrefix(arr);
        QuickSort.printArray(prefix,prefix.length);
    }
}
