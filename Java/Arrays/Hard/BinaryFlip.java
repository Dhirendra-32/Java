package Arrays.Hard;

public class BinaryFlip {
    public static int solution(int [] arr){
        int count_1 = 0;
        int maxi = 0 ;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==1){
                count_1++;
            }
            int subArrCount_1 =0;
            int subArrCount_0 = 0;
            for (int j = i; j < arr.length ; j++) {

                if(arr[j]==1){
                    subArrCount_1++;
                }
                else{
                    subArrCount_0++;
                }

                maxi = Math.max(maxi,subArrCount_1-subArrCount_0);

            }


        }
        System.out.println(count_1);
        System.out.println(maxi);
        return count_1+maxi;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,0,1,1};
        System.out.println(solution(arr));
    }
}
