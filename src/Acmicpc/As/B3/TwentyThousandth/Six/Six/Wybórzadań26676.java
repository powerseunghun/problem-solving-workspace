package Acmicpc.As.B3.TwentyThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Wybórzadań26676 {
	static int[][] arr = new int[5][3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = null;
		boolean flag = true;
		
		while(st.hasMoreTokens()) {
			str = st.nextToken();
			arr[str.charAt(0)-'1'][str.charAt(1)-'A']++;
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 1) {
					flag = false;
				}
			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[arr.length-1][i] < 2) {
				flag = false;
			}
		}
		
		System.out.println(flag ? "TAK" : "NIE");
		br.close();
	}
}
