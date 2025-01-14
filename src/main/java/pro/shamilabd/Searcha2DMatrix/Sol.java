package pro.shamilabd.Searcha2DMatrix;

public class Sol {

    public static void main(String[] args) {
//        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3)); // t
//        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 13)); // f
        System.out.println(searchMatrix(new int[][]{{1}}, 0)); // f
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex = getRowIndex(matrix, target);
        return isContainTarget(matrix[rowIndex], target);
    }

    private static boolean isContainTarget(int[] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (matrix[m] == target) {
                return true;
            } else if (matrix[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }

    private static int getRowIndex(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (matrix[m][0] == target) {
                return m;
            } else if (matrix[m][0] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return Math.max(r, 0);
    }
}