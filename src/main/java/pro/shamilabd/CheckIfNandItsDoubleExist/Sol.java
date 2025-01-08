package pro.shamilabd.CheckIfNandItsDoubleExist;

public class Sol {

    public static void main(String[] args) {
//        System.out.println(checkIfExist(new int[]{10,2,5,3}));
//        System.out.println(checkIfExist(new int[]{3,1,7,11}));
//        System.out.println(checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
        System.out.println(checkIfExist(new int[]{-20,8,-6,-14,0,-19,14,4}));
    }

    public static boolean checkIfExist(int[] arr) {
        if (arr.length < 2) return false;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (j == i) continue;
                int jVal = arr[j];
                if (val == 2 * jVal) {
                    return true;
                }
            }
        }
        return false;
    }
}
