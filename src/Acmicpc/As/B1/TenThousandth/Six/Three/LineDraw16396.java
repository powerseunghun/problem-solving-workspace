package Acmicpc.As.B1.TenThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineDraw16396 {
	static int[] arr = new int[10001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), s = 0, e = 0, res = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			s = Integer.parseInt(str.split(" ")[0]);
			e = Integer.parseInt(str.split(" ")[1]);
			for (int i = s; i < e; i++) {
				arr[i] = 1;
			}
		}
		
		for (int el : arr) {
			res = el > 0 ? res + 1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
