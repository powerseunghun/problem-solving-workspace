package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GinsengField1521 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String tmp = br.readLine();
		int K = Integer.parseInt(tmp.split(" ")[0]), N = Integer.parseInt(tmp.split(" ")[1]), count = 0;
		int[][] arr = new int[K][K];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
				if (arr[i][j] != -1) {
					arr[i][j] += N;
					if (arr[i][j] >= 0 && arr[i][j] <= 5) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
