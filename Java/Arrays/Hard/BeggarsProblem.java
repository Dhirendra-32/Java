package Arrays.Hard;

import Arrays.Easy.QuickSort;

public class BeggarsProblem {
    public static int [] solution(int []arr,int[][]query){
        /*iterating for each row of  given q(3*2) query */
        for (int i = 0; i < query.length; i++) {

            /*for each row will add the given value to array till end from given index example 1(index ),3(value)*/
            for (int j = query[i][0]; j < arr.length; j++) {
                arr[j] += query[i][1];
            }

        }


        return arr;
    }
    public static void main(String[] args) {
        int []arr = new int[]{0,0,0,0,0,0,0};
        int [][] query ={{1,3},{4,2},{2,1}};
        int [] brr = solution(arr,query);
        QuickSort.printArray(brr,brr.length);
    }
}
