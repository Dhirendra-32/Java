/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N.
Find the missing element.*/

package Arrays.Easy;

public class MissingNoProblems {

    public static int MissingNumber(int [] arr){
        int ans  = (arr.length+1)*(arr.length+2)/2;
        System.out.println(ans);
        for (int i = 0; i < arr.length; i++) {

            ans -=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        System.out.println(MissingNumber(arr));
    }
}
