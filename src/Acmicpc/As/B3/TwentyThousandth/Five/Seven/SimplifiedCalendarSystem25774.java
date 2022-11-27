package Acmicpc.As.B3.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimplifiedCalendarSystem25774 {
	static int[] arr = new int[2];
	static void calc(String tmp, int i) {
		int d = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int y = Integer.parseInt(tmp.split(" ")[2]);
		arr[i] = y*360 + m*30 + d;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int bd = 0;
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			calc(tmp, i);
			if (i != 0) continue;
			bd = Integer.parseInt(tmp.split(" ")[3]);
		}
		
		for (int i = 0; i < Math.abs(arr[0]-arr[1]); i++) {
			bd++;
			if (bd > 7) bd = 1;
		}
		System.out.println(bd);
		br.close();
	}
}
