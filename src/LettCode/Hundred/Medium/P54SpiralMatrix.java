package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.List;

public class P54SpiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int r = 0, c = -1, n = matrix.length, m = matrix[0].length;
        int th = 0, d = 1, count = 0;
        
        while (count <  (n*m)) {
        	System.out.println("count : " + count);
            for (int i = 0; i < m-th; i++) {
                c += d;
                list.add(matrix[r][c]);
                count++;
            }
            for (int i = 0; i < n-th-1; i++) {
                r += d;
                list.add(matrix[r][c]);
                count++;
            }
            th++;
            d *= -1;
        }
        return list;
    }
    public static void main(String[] args) {
    	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> list = spiralOrder(matrix);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}
}
