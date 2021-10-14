package LettCode.Hundred.Medium;

public class P59SpiralMatrix2 {
    static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int r = 0, c = -1, d = 1, value = 1, th = 0;
        
        while (value <= n*n) {
            for (int i = 0; i < n-th; i++) {
                c += d;
                arr[r][c] = value++;
            }
            for (int i = 0; i < n-th-1; i++) {
                r += d;
                arr[r][c] = value++;
            }
            th++;
            d *= -1;
        }
        return arr;
    }
	public static void main(String[] args) {
	}
}
