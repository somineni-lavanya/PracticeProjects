package pack;

public class RangeQueries {
        public static void main(String[] args) {
			// Range Queries demo
			System.out.println("Range Queries demo");

			int[] arr = { 4, 45, 12, 3, 7, 11 };

			SparseTable sTable1 = new SparseTable(arr);

			long answer1 = sTable1.query(0, 3);
			System.out.println(answer1); // 64
			long answer2 = sTable1.query(2, 4);
			System.out.println(answer2); // 22
		}}
		class SparseTable {

			int[][] sparseTable;

			public SparseTable(int[] arr) {

				int n = arr.length;

				// Number of column is the sparse table;
				int logN = (int) (Math.log(n) / Math.log(2)) + 1;

				sparseTable = new int[n][logN];

				// Initialize the sparse table with the values from the input array
				for (int i = 0; i < n; i++) {
					sparseTable[i][0] = arr[i];
				}

				// Build the sparse table
				for (int j = 1; (1 << j) <= n; j++) {
					for (int i = 0; i + (1 << j) - 1 < n; i++) {
						sparseTable[i][j] = sparseTable[i][j - 1] + sparseTable[i + (1 << (j - 1))][j - 1];
					}
				}

			}

			public long query(int L, int R) {
				long answer = 0;
				int k = 16;

				for (int j = k; j >= 0; j--) {
					if (L + (1 << j) - 1 <= R) {
						answer = answer + sparseTable[L][j];
						L += 1 << j;
					}
				}
				return answer;
			}

	}
	

