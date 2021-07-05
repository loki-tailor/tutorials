package com.arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] z = { { 3, 2, 5 }, { 7, 4, 7 }, { 29, 11, 20 } };
		printMultiDimensionalArr(z);
		System.out.println();

		// min of amongst row and maximum from that column in which the minimum is found
		int min = z[0][0];
		int colIndex = 0;
		for (int[] i : z) {
			for (int j = 0; j < i.length; j++) {
				if (min > i[j]) {
					min = i[j];
					colIndex = j;
				}
			}
		}

		int max = z[0][colIndex];
		for (int row[] : z) {
			if (max < row[colIndex]) {
				max = row[colIndex];
			}
		}
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}

	public static void minimumOfAnArray(String[] args) {

		int[][] z = { { 3, 2, 5 }, { 7, 4, 1 }, { 29, 11, 0 } };

		// minimum of the complete array
		int min = z[0][0];
		for (int i[] : z) {
			for (int j : i) {
				if (min > j) {
					min = j;
				} // end of if
			} // end of for over i
		} // end of for over zs
		printMultiDimensionalArr(z);
		System.out.println();
		System.out.println(min);
	}

	public static void printArrays(String[] args) {
		int[][] a = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		// System.out.println(a);

		for (int[] i : a) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();

		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 } };
		for (int[] i : b) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void printMultiDimensionalArr(int[][] z) {
		for (int[] i : z) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
