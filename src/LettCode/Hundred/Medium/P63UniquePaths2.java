package LettCode.Hundred.Medium;

public class P63UniquePaths2 {
    static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] arr = new int[obstacleGrid.length][obstacleGrid[0].length];
        boolean zeroRow = false, zeroColumn = false;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    if (i == 0) zeroRow = true;
                    if (j == 0) zeroColumn = true;
                    continue;
                }
                if (zeroRow && i == 0) continue;
                if (zeroColumn && j == 0) continue;
                arr[i][j] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (obstacleGrid[i][j] == 1) continue;
                if (i == 0 || j == 0) continue;
                arr[i][j] = arr[i][j-1]+arr[i-1][j];
            }
        }
        return arr[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
	public static void main(String[] args) {
	}
}
