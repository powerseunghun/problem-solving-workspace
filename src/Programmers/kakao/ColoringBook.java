package Programmers.kakao;

public class ColoringBook {
	static int count = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static boolean[][] check = null;
	static void dfs(int x, int y, int val, int[][] picture) {
		if (picture[x][y] != val) return;
		
		count++;
		check[x][y] = true;
		// 원본 배열 훼손 안해야하더라 이유는 모름
		// picture[x][y] = -1;
		
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			if (nx < 0 || ny < 0 || nx > picture.length-1 || ny > picture[nx].length-1) continue;
			if (!check[nx][ny]) dfs(nx, ny, val, picture);
		}
		
	}
	static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        check = new boolean[m][n];
        
//        for (int i = 0; i < m; i++) {
//        	for (int j = 0; j < n; j++) {
//        		System.out.print(picture[i][j] + " ");
//        	}
//        	System.out.println();
//        }
//        System.out.println("\n");
        
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (picture[i][j] > 0 && !check[i][j]) {
        			count = 0;
        			numberOfArea++;
        			dfs(i, j, picture[i][j], picture);
        			maxSizeOfOneArea = Math.max(maxSizeOfOneArea, count);
        		}
        	}
        }
        
//        for (int i = 0; i < m; i++) {
//        	for (int j = 0; j < n; j++) {
//        		System.out.print(picture[i][j] + " ");
//        	}
//        	System.out.println();
//        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
	public static void main(String[] args) {
		int m = 6, n = 4;
		int[][] picture = {{1,1,1,0}, {1,2,2,0}, {1,0,0,1}, {0,0,0,1}, {0,0,0,3}, {0,0,0,3}};
		
		int[] ans = solution(m, n, picture);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}
}
