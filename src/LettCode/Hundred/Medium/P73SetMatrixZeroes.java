package LettCode.Hundred.Medium;

import java.util.HashSet;
import java.util.Set;

public class P73SetMatrixZeroes {
    static Set<Integer> rows = new HashSet<>();
	static Set<Integer> columns = new HashSet<>();
    static void addSet(int[][] matrix) {
        rows.clear();
        columns.clear();
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
    }
    static void setZeroes(int[][] matrix) {
        addSet(matrix);
        Object[] arr = rows.toArray();
		for (int i = 0, val = 0; i < arr.length; i++) {
			val = (int)arr[i];
			for (int j = 0; j < matrix[val].length; j++) {
				matrix[val][j] = 0;
			}
		}
        arr = columns.toArray();
		for (int i = 0, val = 0; i < arr.length; i++) {
			val = (int)arr[i];
			for (int j = 0; j < matrix.length; j++) {
				matrix[j][val] = 0;
			}
		}
    }
	public static void main(String[] args) {

	}
}
