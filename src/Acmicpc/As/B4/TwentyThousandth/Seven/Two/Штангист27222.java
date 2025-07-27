package Acmicpc.As.B4.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Штангист27222 {
	static int[] arr = null, x = null, y = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 0;
		String str = null;
		arr = new int[n];
		x = new int[n];
		y = new int[n];
		str = br.readLine();
		
		for (int i = 0; i < str.split(" ").length; i++) {
			arr[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			x[i] = Integer.parseInt(str.split(" ")[0]);
			y[i] = Integer.parseInt(str.split(" ")[1]);
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0 && x[i] < y[i]) res += y[i]-x[i];
		}
		
		System.out.println(res);
		br.close();
	}
}
