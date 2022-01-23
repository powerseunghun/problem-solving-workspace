package ProgrammingChallenges.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem7 {
	static char[][] arr = null;
	static boolean isPlay() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != '.') return false;
			}
		}
		return true;
	}
	static boolean check(char c, int i, int j) {
//		char target = ' ';
//		if (c >= 'a' && c <= 'z') target = 'X';
//		else target = 'x';
		
		switch(c) {
		case 'p':
			if (arr[i+1][j-1] == 'X' || arr[i+1][j+1] == 'X') return true;
			else return false;
		case 'P':
			if (arr[i-1][j-1] == 'x' || arr[i-1][j+1] == 'x') return true;
			else return false;
		case 'r':
		case 'R':
			break;
		}
		
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		while (true) {
			arr = new char[10][10];
			for (int i = 1; i < arr.length-1; i++) {
				tmp = br.readLine();
				for (int j = 1; j < arr[i].length-1; j++) {
					arr[i][j] = tmp.charAt(j);
				}
			}
			if (!isPlay()) break;
			br.readLine();
			
			for (int i = 1; i < arr.length-1; i++) {
				for (int j = 1; j < arr[i].length-1; j++) {
					if (arr[i][j] != '.') {
						if (check(arr[i][j], i, j)) {}
					}
				}
			}
		}
	}
}
