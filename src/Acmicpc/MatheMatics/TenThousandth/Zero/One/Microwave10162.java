package Acmicpc.MatheMatics.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave10162 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = {300, 60, 10}, tArr = new int[3];
		int T = Integer.parseInt(br.readLine()), idx = 0;
		
		while (true) {
			if ((T <= 0 || T > 0 && T < 10)) {
				break;
			}
			if (T >= arr[idx]) {
				T -= arr[idx];
				tArr[idx]++;
			}
			else idx++;
		}
		if (T > 0) {
			System.out.println("-1");
			return;
		}
		for (int el : tArr) {
			System.out.print(el + " ");
		}
	}
}
