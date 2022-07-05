package Acmicpc.As.B3.NineThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheQuadrant9610 {
	static int[] arr = new int[5];
	static int check(int x, int y) {
		if (x > 0 && y > 0) return 0;
		else if (x < 0 && y > 0) return 1;
		else if (x < 0 && y < 0) return 2;
		else if (x > 0 && y < 0) return 3;
		else return 4;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), x = 0, y = 0;
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			arr[check(x, y)]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append((i==arr.length-1) ? "AXIS: " : ("Q" + (i+1) + ": "));
			sb.append(arr[i] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
