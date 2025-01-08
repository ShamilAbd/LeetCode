package pro.shamilabd.CountNegativeNumbersinaSortedMatrix;

public class Sol {

    public static void main(String[] args) {
//        int[][] list = new int[][]{
//                {4,   3,  2, -1},
//                {3,   2,  1, -1},
//                {1,   1, -1, -2},
//                {-1, -1, -2, -3}};//8
//        System.out.println(countNegatives(list));
        int[][] list2 = new int[][]{
                {3, 2},
                {1, 0}};//0
        System.out.println(countNegatives(list2));
    }

    public static int countNegatives(int[][] grid) {
        int n = 0;
        int row = 0;
        int j = 0;
        for (int i = grid[row].length - 1; i >= 0; i--) {
            while (grid[row][i] >= 0) {
                row++;
                if (row >= grid.length) return n;
            }
            n += (grid.length - row);
        }
        return n;
    }
}
