package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Parrot {
	static void printArray(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int N = Integer.parseInt(input.split(" ")[0]);
		int M = Integer.parseInt(input.split(" ")[1]), d = 0;
		char[][] arr = new char[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], '.');
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				if (d%2 == 0) arr[i][0] = '#';
				else arr[i][arr[i].length-1] = '#';
				continue;
			}
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = '#';
			}
			d++;
		}
		printArray(arr);
	}
}
