package test;

public class P4 {
	static int[][] grid = {{2,1,1,3,5,1},{1,1,3,3,5,5},{8,3,3,3,1,5},
			{3,3,3,4,4,4},{3,3,4,4,4,4},{1,4,4,4,4,4}};
	
	static int count = 0;
	static boolean check(int maxSize) {
		boolean flag = false;
		int val = 0;
		
		for (int i = 0; i <= grid.length-maxSize; i++) {
			for (int j = i; j < Math.min(i+maxSize, grid.length); j++) {
				val = val == 0 ? grid[i][j] : val;
			}
		}
		
		return flag;
	}
	public static void main(String[] args) {
		System.out.println(grid.length);
		int maxSize = grid.length % 2 == 0 ? grid.length / 2 : grid.length / 2 + 1;
		
		
		for (int i = maxSize; i >= 1; i--) {
			if (check(maxSize)) {
				
			}
//			for (int j = 0; j < grid.length; j++) {
//				for (int k = 0; k < grid[j].length; k++) {
//					if (check(i, j, k, grid[j][k])) {
//						
//					}
//				}
//			}
		}
		
	}
}
