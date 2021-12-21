package Programmers.level2;

public class QuadCompression {
	static int countZero = 0;
	static int countOne = 0;
	static boolean check(int x, int y, int N, int[][] arr) {
		int base = arr[x][y];
		
		for (int i = x; i < x+N; i++) {
			for (int j = y; j < y+N; j++) {
				if (arr[i][j] != base) {
					return false;
				}
			}
		}
		if (base == 0) countZero++;
		else countOne++;
		
		return true;
	}
	static void divide(int x, int y, int N, int[][] arr) {
		if (N == 1) {
			if (arr[x][y] == 0) countZero++;
			else countOne++;
			return;
		}
		
		if (check(x, y, N, arr)) return;
		divide(x, y, N/2, arr);
		divide(x, y+(N/2), N/2, arr);
		divide(x+(N/2), y, N/2, arr);
		divide(x+(N/2), y+(N/2), N/2, arr);
	}
	static int[] solution(int[][] arr) {
        int[] answer = new int[2];
        divide(0, 0, arr.length, arr);
        
        answer[0] = countZero;
        answer[1] = countOne;
        return answer;
    }
	public static void main(String[] args) {
		int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		int[] res = solution(arr);
		
		System.out.println(res[0] + ", " + res[1]);
	}
}
