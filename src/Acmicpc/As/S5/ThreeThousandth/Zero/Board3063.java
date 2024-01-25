package Acmicpc.As.S5.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board3063 {
	static final int len = 8;
	static int[] arr = new int[len];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), res = 0, tmp1 = 0, tmp2 = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			for (int i = 0; i < str.split(" ").length; i++) {
				arr[i] = Integer.parseInt(str.split(" ")[i]);
			}
			res = (arr[2]-arr[0]) * (arr[3]-arr[1]);
			tmp1 = Math.max(Math.min(arr[2], arr[6])-Math.max(arr[0], arr[4]), 0);
			tmp2 = Math.max(Math.min(arr[3], arr[7])-Math.max(arr[1], arr[5]), 0);
			res -= tmp1 * tmp2;
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
