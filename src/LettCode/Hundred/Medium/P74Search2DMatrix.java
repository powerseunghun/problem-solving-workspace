package LettCode.Hundred.Medium;

import java.io.IOException;

public class P74Search2DMatrix {
    static boolean searchMatrix(int[][] matrix, int target) {
    	int left = 0, right = 0, mid = 0;
        for (int i = 0; i < matrix.length; i++) {
        	for (int j = 0, min = 0, max = 0; j < matrix[i].length; j++) {
        		min = matrix[i][0];
        		max = matrix[i][matrix[i].length-1];
        		if (target >= min && target <= max) {
        			left = 0;
        			right = matrix[i].length-1;
        			while (left <= right) {
        				mid = (left+right)/2;
        				if (matrix[i][mid] == target) {
        					return true;
        				}
        				else if (matrix[i][mid] < target) left++;
        				else right--;
        			}
        			return false;
        		}
        	}
        }
        return false;
    }
	public static void main(String[] args) throws IOException {
		int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
	}
}
