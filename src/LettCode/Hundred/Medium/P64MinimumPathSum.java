package LettCode.Hundred.Medium;

public class P64MinimumPathSum {
    static int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
        	for (int j = 0; j < grid[i].length; j++) {
        		if (i == 0 && j != 0) grid[i][j] += grid[i][j-1];
        		if (j == 0 && i != 0) grid[i][j] += grid[i-1][j];
        	}
        }
        
        for (int i = 1; i < grid.length; i++) {
        	for (int j = 1; j < grid[i].length; j++) {
        		grid[i][j] = grid[i][j] + Integer.min(grid[i-1][j], grid[i][j-1]);
        	}
        }
        
        return grid[grid.length-1][grid[0].length-1];
    }
	public static void main(String[] args) {
		int[][] grid = {{1,2,3},{4,5,6}};
		System.out.println(minPathSum(grid));
	}
}
