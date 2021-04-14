package Acmicpc.Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanNumber1065 {
	static int getCount(int N) {
		int count = 0, tmp = 0, idx = 0;
		int[] check = new int[3];
		for (int i = 1; i <= N && i < 1000; i++) {
			if (i > 0 && i < 100) {
				count = i;
			}
			else {
				idx = 0;
				tmp = i;
				while (tmp != 0) {
					check[idx++] = tmp % 10;
					tmp /= 10;
				}
				if (check[0] - check[1] == check[1] - check[2]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(getCount(Integer.parseInt(br.readLine())));
	}
}
