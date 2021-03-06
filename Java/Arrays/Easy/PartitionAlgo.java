/*very very important algorithm backbone of Quicksort*/
/* TC:O(N) SC: O(1)*/
/*Intuition: putting selected pivot element at right position */
package Arrays.Easy;
public class PartitionAlgo {
    public static int PartitionRule(int[] A, int p , int q ){
        int pivot = A[p];
        int i = p ;
        int temp;
        for (int j = p+1; j <=q ; j++) {
            if (A[j]<=pivot){
                i=i+1;
                swap(A,i,j);
            }
        }
        swap(A,p,i);
        return i;
    }
    public static void swap(int [] A,int i , int j){
        int temp;
        temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void main(String[] args) {
        int[] A = {1, -4, -45, -6, -50, 10, -2};
        int n = A.length;
        System.out.println(PartitionRule(A,0,n-1));
    }
}
