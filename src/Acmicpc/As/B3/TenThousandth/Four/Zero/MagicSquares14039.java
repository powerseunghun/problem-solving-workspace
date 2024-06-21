package Acmicpc.As.B3.TenThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicSquares14039 {
	static final int len = 4;
	static int[][] arr = new int[len][len];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		String str = null;
		int s = 0;
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(str.split(" ")[j]);
				if (i == 0) s += arr[i][j];
			}
		}
		
		for (int i = 0, ps1 = 0, ps2 = 0; i < arr.length && flag; i++) {
			ps1 = arr[i][0]+arr[i][1]+arr[i][2]+arr[i][3];
			ps2 = arr[0][i]+arr[1][i]+arr[2][i]+arr[3][i];
			if (ps1 != s) flag = false;
			if (ps2 != s) flag = false;
		}
		
		System.out.println(flag ? "magic" : "not magic");
		br.close();
	}
}
