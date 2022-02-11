package Arrays.Medium;

public class PrefixSum2D {

    public static int [][] RowPreFix(int [][]arr){
        int row = arr.length;
        int col = arr[0].length;
        int [][]prefixSumRow = new int[row][col];
        for (int i = 0; i < row; i++) {
            prefixSumRow[i][0] = arr[i][0];
            for (int j = 1; j < col; j++) {
                prefixSumRow[i][j] = arr[i][j] + prefixSumRow[i][j-1];
            }
        }
        int[][] sumPrefix =ColPreFix(prefixSumRow);
        return sumPrefix;
    }

    public static int [][] ColPreFix(int [][]arr){
        int row = arr.length;
        int col = arr[0].length;
        int [][]prefixSumRow = new int[row][col];
        for (int i = 0; i < col; i++) {
            prefixSumRow[0][i] = arr[0][i];
            for (int j = 1; j < row; j++) {
                prefixSumRow[j][i] = arr[j][i] + prefixSumRow[j-1][i];
            }
        }
        return prefixSumRow;
    }

    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1,2,3},{4,5,6}};
        int [][]test = RowPreFix(matrix);
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                System.out.print(" "+test[i][j]);
            }
            System.out.println("");
        }
    }
}
