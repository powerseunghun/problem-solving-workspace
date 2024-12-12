package Acmicpc.As.B3.ThirtyThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RACI32905 {
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		arr = new char[n][m];
		
		for (int i = 0, cnt = 0; i < arr.length && flag; i++, cnt = 0) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.split(" ")[j].charAt(0);
				if (arr[i][j] == 'A') cnt++;
			}
			if (cnt != 1) flag = false;
		}
		
		System.out.println(flag ? "Yes" : "No");
		br.close();
	}
}
