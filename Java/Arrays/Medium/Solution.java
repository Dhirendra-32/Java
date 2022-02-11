/*
Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in increasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
*/
package Arrays.Medium;
public class Solution {
    public static int  solve(int [][]A,int B){
        int i = 0 ;
        int row = A.length;
        int j = A[0].length-1;
        Boolean flag = false;
        int result =Integer.MAX_VALUE;
        while (i<row && j>=0){

            if(A[i][j]==B){
                flag = true;
                if(i==0 && j==0){
                    result =(i+1) * 1009 +(j+1);
                }
                else{
                    result = Math.min(((i+1) * 1009 +(j+1)),result);
                }
                j--;
            }

            else if (A[i][j]<B){
                i++;
            }

            else if (A[i][j]>B){

                j--;
            }

        }


        if (flag){
            return result;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][] arr = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(solve(arr,1));
    }
}
