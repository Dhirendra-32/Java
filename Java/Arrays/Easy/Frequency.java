package Arrays.Easy;
import java.util.Scanner;
public class Frequency {
    public static int findFrequency(int []arr,int num){
        int count_num=0;
        for (int j : arr) {
            if (j == num) {
                count_num++;
            }
        }
        return count_num;
    }
    public static void main(String[] args) {
        int[] A = {1, -45, -45, -6, -45, 10, -2};
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(findFrequency(A,num));
    }
}
