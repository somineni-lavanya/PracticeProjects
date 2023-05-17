package pack;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] firstMatrix = { { 3, -2, 5 }, { 3, 0, 4 } };
		int[][] secondMatrix = { { 2, 3 }, { -9, 0 }, { 0, 4 } };
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;

		// product matrix will be 2 x 2 matrix

		int[][] resultantMatrix = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				System.out.print(resultantMatrix[i][j] + " ");
			}
			System.out.println();
		}
		;

	}

	private static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {

		int[][] productOfTwoMatrices = new int[r1][c2];

		for (int i = 0; i < r1; i++) { // rows of first matrix

			for (int j = 0; j < c2; j++) {

				for (int k = 0; k < c1; k++)
					productOfTwoMatrices[i][j] = productOfTwoMatrices[i][j] + firstMatrix[i][k] * secondMatrix[k][j];
			}

		}

		return productOfTwoMatrices;
	}

}
