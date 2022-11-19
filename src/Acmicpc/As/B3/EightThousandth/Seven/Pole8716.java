package Acmicpc.As.B3.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pole8716 {
	static int[] arr = new int[8];
	static boolean check() {
		// r1      r2
		// 0 1 2 3 4 5 6 7
		// r1 x1 = 0
		// r1 y1 = 1
		// r1 x2 = 2
		// r1 y2 = 3
		// r2 x1 = 4
		// r2 y1 = 5
		// r2 x2 = 6
		// r2 y2 = 7
		if (arr[2] < arr[4] || arr[6] < arr[0] || arr[7] > arr[1] || arr[3] > arr[5]) return true;
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long w = 0, h = 0;
		String tmp = null;
		for (int i = 0, idx = 0; i < 2; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr.length/2; j++) {
				arr[idx++] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		w = Math.min(arr[2], arr[6]) - Math.max(arr[0], arr[4]);
		h = Math.max(arr[3], arr[7]) - Math.min(arr[1], arr[5]);
		System.out.println(check() ? "0" : Math.abs(w*h));
		br.close();
	}
}
