package Programmings;

public class MatrixMultiplication {
	 public static void main(String[] args) {
	        int[][] matrix1 = {{1, 2}, {3, 4}};
	        int[][] matrix2 = {{5, 6}, {7, 8}};
	        int[][] result = new int[2][2];

	        for (int i = 0; i < matrix1.length; i++) {
	            for (int j = 0; j < matrix2[0].length; j++) {
	                for (int k = 0; k < matrix2.length; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }

	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
