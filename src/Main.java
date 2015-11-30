import utils.StringUtils;
import utils.ArrayUtils;


import static utils.ArrayUtils.GenerateRandomDigit;
import static utils.MatrixUtils.*;

/**
 * Created by vkhonin on 11/16/2015.
 */
public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[2][2];
        matrix[0][0] = GenerateRandomDigit(100);
        matrix[0][1] = GenerateRandomDigit(100);
        matrix[1][0] = GenerateRandomDigit(100);
        matrix[1][1] = GenerateRandomDigit(100);

        showMatrix(matrix);

    }
}
