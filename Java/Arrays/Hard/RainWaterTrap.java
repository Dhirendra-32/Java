package Arrays.Hard;

public class RainWaterTrap {

    public static int Solution(int[] arr){
        int amountWater = 0 ;
       /*Looping all the building */
        for (int i = 0; i < arr.length ; i++) {
            int rightMax;
            int leftMax = rightMax = 0 ;

            /*To find max building height at left side for any particular building */
            for (int j = i; j >=0 ; j--) {
                leftMax = Math.max(arr[j],leftMax);
            }

            /*To find max building height at right side for any particular building */
            for (int k = i; k <arr.length ; k++) {
                rightMax = Math.max(arr[k],rightMax);
            }
            amountWater = amountWater + Math.min(rightMax,leftMax)-arr[i];
        }

        return amountWater;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(Solution(arr));

    }
}
