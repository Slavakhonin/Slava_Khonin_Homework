package utils;

/**
 * Created by SlavaKhonin on 11/28/2015.
 */
public class MatrixUtils {

    public static void showMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println("");

        }
    }

}
