package Practice;

import java.util.Scanner;

public class SincereAnt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] maze = new int[10][10];
		int x = 1, y = 1;
		
		boolean move = true, check = false;
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				maze[i][j] = sc.nextInt();
			}
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
