package Acmicpc.OrderSubmit.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Guess1248 {
	static int[] arr = null;
	static char[][] sign = null;
	static boolean flag = false;
	static void bt(int d, int c, int N) {
		if (flag) return;
		if (c != -1) {
			int sum = 0;
			for (int i = 0; i <= c; i++) {
				sum = 0;
				for (int j = i; j <= c; j++) {
					sum += arr[j];
//					System.out.println("sum : " + sum);
					if (sum < 0 && sign[i][j] !='-') return;
					if (sum > 0 && sign[i][j] != '+') return; 
					if (sum == 0 && sign[i][j] != '0') return;
				}
			}
		}
		if (d >= N) {
			flag = true;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = -10; i <= 10; i++) {
			arr[d] = i;
			bt(d+1, d, N);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = br.readLine();
		arr = new int[N];
		sign = new char[N][N];
		
		for (int i = 0, c = 0; i < sign.length; i++) {
			Arrays.fill(sign[i], ' ');
			for (int j = i; j < sign[i].length; j++) {
				sign[i][j] = tmp.charAt(c++);
			}
		}
		bt(0, -1, N);
		
		br.close();
	}
}
