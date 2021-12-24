package Arrays.Medium;

public class MajorityElement {

    public static  int MajorityElements(int []arr,int size){
        int frequency ;
        for (int i = 0; i < size; i++) {
            frequency = 0 ;
            for (int j = 0; j <size; j++) {
                if (arr[i]==arr[j]){
                    frequency++;
                }
                if(frequency>(size/2)){
                    return  arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {3,4,3,6,1,3,2,3,3,3};
        int size = arr.length;
        System.out.println(MajorityElements(arr,size));

    }
}
