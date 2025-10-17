package Acmicpc.As.B3.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WinStreak34302 {
	static boolean[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), S = 0, T = 0, res = 0, c = 0;
		String str = null;
		arr = new boolean[N];
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			S = Integer.parseInt(str.split(" ")[0]);
			T = Integer.parseInt(str.split(" ")[1]);
			arr[i] = S>T;
		}
		
		for (int i = 0; i < arr.length; i++) {
			c = arr[i] ? c+1 : 0;
			res = Math.max(res, c);
		}
		
		System.out.println(res);
		br.close();
	}
}
