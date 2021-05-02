package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoDimensionArray1099 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] maze = new int[10][10];
		int x = 1, y = 1, idx = 0;
		
		boolean move = true, check = false;
		
		for (int i = 0; i < maze.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				maze[i][idx++] = Integer.parseInt(st.nextToken());
			}
			idx = 0;
		}
		
		if (maze[x][y] == 2) {
			maze[x][y] = 9;
			move = false;
		}
		else {
			maze[x][y] = 9;
		}
		while (move) {
			check = false;
			if (maze[x][y + 1] == 0 || maze[x][y + 1] == 2) {
				check = true;
				y += 1;
			}
			else if (maze[x + 1][y] == 0 || maze[x + 1][y] == 2) {
				check = true;
				x += 1;
			}
			
			if (maze[x][y] == 2) {
				maze[x][y] = 9;
				break;
			}
			maze[x][y] = 9;
			
			if (!check) break;
			
		}
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
	}
}
