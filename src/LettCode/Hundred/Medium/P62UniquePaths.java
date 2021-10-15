package LettCode.Hundred.Medium;

public class P62UniquePaths {
    static int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i == 0 || j == 0) ? 1 : arr[i][j-1]+arr[i-1][j];
            }
        }
        return arr[m-1][n-1];
    }
	public static void main(String[] args) {
		int m = 3, n = 7;
		System.out.println(uniquePaths(m, n));
	}
}
